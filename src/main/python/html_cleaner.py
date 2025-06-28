import pandas as pd
import re
import html
import argparse
from collections import Counter

#this script takes an argument of a csv and removes all the html junk from one of the columns.
#the default is a column called Skills_Description because that's what I used it for but that can be changed to anything.

# --- ARGUMENT PARSING ---
parser = argparse.ArgumentParser(description="Clean HTML and unwanted characters from a CSV column.")
parser.add_argument('input_csv', help="Path to the input CSV file.")
parser.add_argument('--output_csv', default='output.csv', help="Path to the output CSV file.")
parser.add_argument('--column', default='Skills_Description', help="Column name to clean.")
args = parser.parse_args()

INPUT_CSV = args.input_csv
OUTPUT_CSV = args.output_csv
COLUMN_TO_CLEAN = args.column

# --- HTML STRIPPING AND UNESCAPING ---
def strip_html_tags(text):
    if not isinstance(text, str):
        return ''
    return re.sub('<.*?>', '', text)

def get_rendered_text(html_text):
    no_tags = strip_html_tags(html_text)
    return html.unescape(no_tags)

# --- REPLACE NON-ASCII CHARACTERS ---
# Define replacements here
CHARACTER_REPLACEMENTS = {
    '·': ' ',
    '•': ' ',
    '–': '-',  # en dash to regular dash
    '’': "'",  # curly apostrophe to straight
    '“': '"',
    '”': '"',
    '§': '',   # remove section symbol
    '\u00A0': ' ',  # non-breaking space to normal space
}

def replace_unwanted_chars(text):
    if not isinstance(text, str):
        return ''
    for char, replacement in CHARACTER_REPLACEMENTS.items():
        text = text.replace(char, replacement)
    return text

# --- READ FROM CSV ---
try:
    df = pd.read_csv(INPUT_CSV)
except Exception as e:
    print(f"Error reading CSV file: {e}")
    exit(1)

# --- CLEAN THE COLUMN ---
if COLUMN_TO_CLEAN in df.columns:
    df[COLUMN_TO_CLEAN] = df[COLUMN_TO_CLEAN].apply(get_rendered_text)
    df[COLUMN_TO_CLEAN] = df[COLUMN_TO_CLEAN].apply(replace_unwanted_chars)
else:
    print(f"Column '{COLUMN_TO_CLEAN}' not found in input CSV.")
    exit(1)

# --- SAVE TO CSV ---
df.to_csv(OUTPUT_CSV, index=False)
print(f"Cleaned data saved to {OUTPUT_CSV}")

# --- AUDIT NON-ASCII CHARACTERS ---
#this part makes sure all the junk was removed but it should always be nothing if it works as intended.
print("\n--- Non-ASCII Characters Found ---")
all_text = ''.join(df[COLUMN_TO_CLEAN].dropna().astype(str))
weird_chars = [c for c in all_text if ord(c) > 127]
counts = Counter(weird_chars)

if not counts:
    print("No non-ASCII characters found.")
else:
    for char, count in counts.items():
        print(f"'{char}' (U+{ord(char):04X}) : {count} occurrence(s)")
