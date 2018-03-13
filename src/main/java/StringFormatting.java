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

        for (String string : strings) {
            System.out.format("%32s", string);
        }
    }

}
