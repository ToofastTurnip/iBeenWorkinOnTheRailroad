import java.util.concurrent.ThreadLocalRandom;

public class Dice {

    public int diceRoller(int faces, int rolls) {
        int res = 0;
        for (int i = 0; i < rolls; i++) {
            res = res + ThreadLocalRandom.current().nextInt(1, faces + 1);
        }
        System.out.println("Result " + res);
        return res;
    }

}
