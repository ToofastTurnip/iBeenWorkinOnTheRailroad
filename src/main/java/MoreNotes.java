import java.util.*;

public class MoreNotes {

        /**
         * TODO:
         * Count items
         * Make arraylists for prices (and maybe store them on an arraylist)
         * Check for missing field and count exceptions
         * Make method for fixing names, types, food name, and all that jazz
         * Make method for splitting everything at the weird symbols (maybe into array)
         * Need to iterate through array and make sure name is followed by the name and type is followed by the type and throw the error if it isn't
         * Big block for formatting results
         */

        private int errorCounter = 0;

        private String fieldPattern = "([A-Za-z0-9.]+)";
        private String stringSplitPattern = "([;:^@%*!])";
        String originalString;

        public String[] splitStringIntoArray(String string){
            return string.split("##");
        }

        public String getFoodFromJsonArrayChunk(String string) {
            try {
                String[] tempArray = string.split(stringSplitPattern);
                return tempArray[1];
            } catch (Exception e) {
                // errorCounter++;
                return "foodPlaceholder";
            }
        }

        public String getPriceFromJsonArrayChunk(String string) {
            try {
                String[] tempArray = string.split(stringSplitPattern);
                return tempArray[3];
            } catch (Exception e) {
                // errorCounter++;
                return "foodPlaceholder";
            }
        }

        public String nameFixer(String name) {
            try {
                char firstLetter = name.toLowerCase().charAt(0);
                if (firstLetter == 'm') return "Milk";
                if (firstLetter == 'c') return "Cookie";
                if (firstLetter == 'a') return "Apple";
                if (firstLetter == 'b') return "Bread";
            } catch (Exception e) {
                errorCounter++;
                return "What?";
            }
            return "How did the program even get here lol";
        }

        public String outputBuilder(String string) {
            StringBuilder sb = new StringBuilder();
            // Build dat table boy
            return sb.toString();
        }




// Missing field example
// Do one for every field

/*
    public void checkForMissingField(Item item)throws FieldMissingException{
        if(item.getName().equals("")){
            throw new FieldMissingException();
        }
*/


// Name fixer example
// Do one for every field and every food

/*
    public String correctCookies(String input){
        String pattern = "[0cokiesCOKIES]{7}";
        StringBuilder buffer = new StringBuilder(input);
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(buffer);
        while(m.find()){
            buffer.replace(m.start(),m.end(),"Cookies");
        }
        input = buffer.toString();
        return input;
    }

    or like
    Pattern cookies = Pattern.compile("[cC][oO0][oO0][kK][iI][eE][sS]");   then
    else if(cookies.matcher(name).matches()) {
        name = "Cookies";
    }
    and
    public static void matchExpiration(String expiration) {
    Pattern pattern = Pattern.compile("([0-9]+\\/[0-9]+\\/[0-9]+)");
    if(!pattern.matcher(expiration).matches()) {
        throw new IllegalArgumentException();
    }
}

 */

}
