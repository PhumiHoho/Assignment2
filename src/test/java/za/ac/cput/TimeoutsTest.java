package za.ac.cput;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TimeoutsTest {
Timeouts timeouts = new Timeouts();



    @Test (timeout = 10)
    public void timeout() {
        String str = timeouts.input;
        timeouts.inputValue("What's up?");
        Assert.assertNotNull(timeouts.timeout());

    }
}