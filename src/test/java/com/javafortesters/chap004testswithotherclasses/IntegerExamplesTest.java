package com.javafortesters.chap004testswithotherclasses;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerExamplesTest {

    @Test
    public void integerExploration(){

        Integer four = new Integer(4);
        assertEquals(4, four.intValue());

        Integer five = new Integer("5");
        assertEquals(5, five.intValue());

        Integer six = 6;
        assertEquals(6, six.intValue());
    }
}
