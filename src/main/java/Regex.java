import java.util.regex.*;

public class Regex {

    public static void main(String[] args) {

        String willBeTrueWhenComparedToAnything = ".*";
        String willBeTrueWhenComparedToStringThatIsNotEmpty = ".+"; // Plus means one or more of the previous character
        String willBeTrueWhenComparedToStringOfOnlyNumbers = "\\d*";

        String bothWaysToSpellGray = "gr(a|e)y";

        String shoeMaybePlural = "shoes?";


        System.out.println("shoe".matches(shoeMaybePlural));
        System.out.println("shoes".matches(shoeMaybePlural));
        System.out.println("shoess".matches(shoeMaybePlural));



        // String formatting BABY
        System.out.println(String.format("%-15s%10s%15s%2d%5s", "name:", "Milk", "seen: ", 0, " times"));
        System.out.println(String.format("%-15s%10s%15s%2d%5s", "price:", "MilkMilk", "seen: ", 10, " times"));
        System.out.println(String.format("%-15s%10s%15s%2d%5s", "expiration:", "MilkMilk", "seen: ", 10, " times"));

        String splitAtTheseChars = "([;:^@%*!])";
        String splitMeUp = "name:cookies;price:2.35^type";
        String[] splitted = splitMeUp.split(splitAtTheseChars);

        for (String aSplitted : splitted) {
            System.out.print(aSplitted + " ");
        }

    }

}
