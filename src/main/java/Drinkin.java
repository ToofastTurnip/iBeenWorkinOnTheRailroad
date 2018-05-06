public class Drinkin {

    public String hydrate(String drinkString) {
        String[] arr = drinkString.split(" ");
        int glasses = 0;
        String ret = "";
        for (String anArr : arr) {
            int temp = 0;
            try {
                temp = Integer.parseInt(anArr);
            } catch (NumberFormatException ignored) {}
            glasses += temp;
        }
        boolean greaterThanOne = false;
        if (glasses > 1) greaterThanOne = true;
        ret += Integer.toString(glasses);
        if (greaterThanOne) {
             ret += " glasses of water";
        } else {
            ret += " glass of water";
        }
        return ret;
    }

}
