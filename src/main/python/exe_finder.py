import sys
import os

# to use, run `python filter_exe_files.py myfiles.txt` where myfiles.txt is the path to the list of files

def filter_exe_files(input_path):
    # Ensure the file exists
    if not os.path.isfile(input_path):
        print(f"Error: '{input_path}' not found.")
        return

    output_path = os.path.join(os.path.dirname(input_path), "fixed.txt")

    with open(input_path, 'r', encoding='utf-8') as infile:
        lines = infile.readlines()

    # Keep only lines ending exactly with '.exe'
    exe_files = [line.strip() for line in lines if line.strip().lower().endswith(".exe")]

    with open(output_path, 'w', encoding='utf-8') as outfile:
        outfile.write("\n".join(exe_files))

    print(f"Filtered .exe filenames written to: {output_path}")

if __name__ == "__main__":
    if len(sys.argv) != 2:
        print("Usage: python filter_exe_files.py <path_to_txt_file>")
    else:
        filter_exe_files(sys.argv[1])
