import org.junit.Assert;
import org.junit.Test;

public class DiceTest {

    @Test
    public void diceTest1() {
        Dice dice = new Dice();
        int min = 1;
        int max = 20;
        int timesRolled = 2000;
        int result = dice.diceRoller(20, timesRolled);
        Assert.assertTrue("The number is not within the range", result >= 2000 && result <= 40000);
    }

}
