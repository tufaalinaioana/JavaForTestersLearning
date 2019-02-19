package com.javafortesters.chap003myfirsttest.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyFirstTestExercises {

    @Test
    public void doiMinusDoi(){

        int rezultat = 2-2;
        assertEquals(0, rezultat);
    }

    @Test
    public void patruImpartitLaDoi(){

        int rezultat1 = 4/2;
        assertEquals(2, rezultat1);
    }

    @Test
    public void doiOriDoi(){

        int rezultatul2 = 2*2;
        assertEquals(4, rezultatul2);
    }
}
