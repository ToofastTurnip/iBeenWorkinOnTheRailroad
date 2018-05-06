import org.junit.Assert;
import org.junit.Test;

public class TestLand {

    @Test
    public void splitStringToArrayTest() {
        StringFormatting sf = new StringFormatting();
        String originalString = "string";
        String expected = "gnirts";
        String actual = sf.rev(originalString);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void factorialTest() {
        Factorial factorial = new Factorial();
        System.out.println(factorial.recursiveFactorial(5));
    }

}
