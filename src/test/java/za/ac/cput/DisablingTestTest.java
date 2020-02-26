package za.ac.cput;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;



public class DisablingTestTest {
    DisablingTest dt = new DisablingTest();
    @Before
    public void setUp() throws Exception {

    }
    @Ignore
    @Test
    public void disabling() {
        Assert.assertNotNull(dt.disabling("it works"));
    }
}