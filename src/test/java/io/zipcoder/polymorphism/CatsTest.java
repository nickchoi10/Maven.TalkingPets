package io.zipcoder.polymorphism;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CatsTest extends TestCase {


Cats catInstance = new Cats("nicholas");
    @Test
    public void testInheritance(){
        Assert.assertTrue(catInstance instanceof Pets);
    }

    @Test
    public void testSpeak() {
        String expected = "meowww";
        String actual = catInstance.speak();
        Assert.assertEquals(expected,actual);
    }



}