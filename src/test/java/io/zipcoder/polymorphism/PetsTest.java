package io.zipcoder.polymorphism;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class PetsTest extends TestCase {
    Pets pet = new Pets();

    public void testTestGetName() {
        String expected = "Nick";
        pet.setName(expected);
        String actual = pet.getName();
        Assert.assertEquals(expected,actual);
    }

    public void testTestSetName() {
        pet.setName("nogi");
        Assert.assertEquals("nogi", pet.getName());
    }

    public void testSpeak() {
        String actual = pet.speak();
        Assert.assertEquals("", actual);
    }


}