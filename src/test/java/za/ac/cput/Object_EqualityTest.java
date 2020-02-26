package za.ac.cput;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Object_EqualityTest {
Object_Equality oe = new Object_Equality();
Object_Equality oe1 = new Object_Equality();
    @Test
    public void objectEquality() {
        Assert.assertTrue(oe.objectEquality("hello world").equals(oe1.objectEquality("hello world")));


    }
}