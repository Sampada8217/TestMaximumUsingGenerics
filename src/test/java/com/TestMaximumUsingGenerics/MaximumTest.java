package com.TestMaximumUsingGenerics;

import org.junit.Assert;
import org.junit.Test;



public class MaximumTest {


    @Test
    public void givenMaxValue_atPos1_shouldReturn_sameNumber() {
        Maximum maximum = new Maximum();
        int max = maximum.testMaxValue(6, 4, 5);
        Assert.assertEquals(6, max);
    }

    @Test
    public void givenMaxValue_atPos2_shouldReturn_sameNumber() {
        Maximum maximum = new Maximum();
        int max = maximum.testMaxValue(4, 6, 5);
        Assert.assertEquals(6, max);
    }


    @Test
    public void givenMaxValue_atPos3_shouldReturn_sameNumber() {
        Maximum maximum = new Maximum();
        int max = maximum.testMaxValue(4,5,6);
        Assert.assertEquals(6, max);
    }

    @Test
    public void givenMaxValueFloat_atPos1_shouldReturn_sameNumber() {
        Maximum maximum = new Maximum();
        Comparable maxNumberFloat = maximum.testMaxFloatValue(6.5F, 4.5F, 5.5F);
        Assert.assertEquals(6.5F,maxNumberFloat);
    }

    @Test
    public void givenMaxValueFloat_atPos2_shouldReturn_sameNumber() {
        Maximum maximum = new Maximum();
        Comparable maxNumberFloat = maximum.testMaxFloatValue(4.5F, 6.5F, 5.5F);
        Assert.assertEquals(6.5F, maxNumberFloat);

    }

    @Test
    public void givenMaxValueFloat_atPos3_shouldReturn_sameNumber() {
        Maximum maximum = new Maximum();
        Comparable maxNumberFloat = maximum.testMaxFloatValue(4.5F, 5.5F, 6.5F);
        Assert.assertEquals(6.5F,maxNumberFloat);

    }

    @Test
    public void givenMaxString_atPos1_shouldReturn_sameString() {
        Maximum maximum=new Maximum();
        String maxString=maximum.testMaxString("Banana","Apple","Peach");
        Assert.assertEquals("Peach",maxString);
    }
    @Test
    public void givenMaxString_atPos2_shouldReturn_sameString() {
        Maximum maximum=new Maximum();
        String maxString=maximum.testMaxString("Apple","Banana","Peach");
        Assert.assertEquals("Peach",maxString);
    }
    @Test
    public void givenMaxString_atPos3_shouldReturn_sameString() {
        Maximum maximum=new Maximum();
        String maxString=maximum.testMaxString("Apple","Peach","Banana");
        Assert.assertEquals("Peach",maxString);
    }

}






