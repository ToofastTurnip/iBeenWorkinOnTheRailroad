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

        String name = "name";


        System.out.println(String.format("%s:%15s%15s%2d%5s", name, "Milk", "seen: ", 0, " times"));
        System.out.println(String.format("%s:%15s%15s%2d%5s", name, "MilkMilk", "seen: ", 10, " times"));


    }

}
