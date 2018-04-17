import java.util.ArrayList;
import java.util.HashMap;

public class Jp {

    public String phoneToWords(String line) {
        final HashMap<Character,String> map = new HashMap<Character,String>(){{
            put('1', "1");
            put('2',"abc");
            put('3',"def");
            put('4',"ghi");
            put('5',"jkl");
            put('6',"mno");
            put('7',"pqrs");
            put('8',"tuv");
            put('9',"wxyz");
            put('0', "0");
        }};

        ArrayList<String> foo = new ArrayList<>();
        ArrayList<String> bar = new ArrayList<>();
        foo.add("");
        for(int i = 0; i < line.length(); i++) {
            String tempString = map.get(line.charAt(i));
            if (tempString.length() == 0)
                continue;
            for(String str : foo) {
                for(int j = 0; j < tempString.length(); j++) {
                    bar.add(str + tempString.charAt(j));
                }
            }
            foo = bar;
            bar = new ArrayList<>();
        }
        String answer = String.join(",", foo);
        System.out.println(answer);
        return answer;
    }

}
