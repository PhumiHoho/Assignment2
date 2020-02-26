package za.ac.cput;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Object_IdentityTest {
Object_Identity oi = new Object_Identity();
Object_Identity oi1 = new Object_Identity();
    @Test
    public void objectIdentity() {
        Assert.assertSame(true,oi.objectIdentity()==oi1.objectIdentity());
    }
}