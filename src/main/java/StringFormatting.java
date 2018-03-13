import java.util.ArrayList;

public class StringFormatting {

    public static void main(String[] args) {

        // Ready to roll baby

        String testStringOne = "Text";
        String testNumberOne = "1";
        String testStringTwo = "Long Text";
        String testNumberTwo = "22";
        String testStringTre = "T";
        String testNumberTre = "3";

        ArrayList<String> strings = new ArrayList<String>();
        strings.add(testStringOne);
        strings.add(testNumberOne);
        strings.add(testStringTwo);
        strings.add(testNumberTwo);
        strings.add(testStringTre);
        strings.add(testNumberTre);

        // Spacing test
        // spaceShitApart(strings);

        // justifyShit();

        fieldWidthAndMaxChars();

    }

    private static void spaceShitApart(ArrayList<String> stringToDoTheThingTo) {
        for (String string : stringToDoTheThingTo) {
            System.out.format("%10s", string);
        }
    }

    private static void justifyShit() {
        String.format("");
        // finish this in a sec
    }

    private static void fieldWidthAndMaxChars() {
        System.out.println(String.format("|%3O.5s|", "Hello World"));
    }

}
