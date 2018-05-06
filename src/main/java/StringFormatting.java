import java.util.ArrayList;

public class StringFormatting {

    public String rev(String string) {
        String ret = "";
        for (int i = string.length()-1; i >= 0; i--) {
            ret += string.charAt(i);
        }
        return ret;
    }

    private void spaceShitApart(ArrayList<String> stringToDoTheThingTo) {
        for (String string : stringToDoTheThingTo) {
            System.out.format("%10s", string);
        }
    }

    private static void fieldWidthAndMaxChars() {
        System.out.println(String.format("|%3O.5s|", "Hello World"));
    }

}
