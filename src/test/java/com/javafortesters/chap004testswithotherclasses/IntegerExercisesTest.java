package com.javafortesters.chap004testswithotherclasses;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IntegerExercisesTest {

    @Test
    public void canConvertIntToHex(){

        assertEquals("hex 11 is b", "b", Integer.toHexString(11));
        assertEquals("hex 10 is a", "a", Integer.toHexString(10));
        assertEquals("hex 3 is 3", "3", Integer.toHexString(3));
        assertEquals("hex 21 is 15", "15", Integer.toHexString(21));
    }

    @Test
    public void canConfirmIntMinAndMaxLimits(){

        int minimumInt = -2147483648;
        int maximumInt = 2147483647;

        assertEquals(minimumInt, Integer.MIN_VALUE);
        assertEquals(maximumInt, Integer.MAX_VALUE);

        Integer firstFour = new Integer(4);
        Integer secondFour = new Integer(4);

        assertEquals(firstFour, secondFour);
        assertTrue(firstFour.equals(secondFour));
    }
}
