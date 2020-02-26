package za.ac.cput;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Failing_TestTest {
Failing_Test ft = new Failing_Test();
    @Test
    public void additon() {
        fail("it is what it is!!!!!!!");
        Assert.assertEquals(2,ft.additon(1,1));

    }

    @Test
    public void subtraction() {

        Assert.assertEquals(0,ft.subtraction(1,1));
    }
}