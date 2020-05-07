package com.TestMaximumUsingGenerics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {

    @Test
    public void givenMaxValue_atPos1_shouldReturn_sameNumber() {
        Maximum maximum = new Maximum();
        int max = (int)maximum.testMaxValue(6, 4, 5,3,2);
        Assert.assertEquals(6, max);
    }

    @Test
    public void givenMaxValue_atPos2_shouldReturn_sameNumber() {
        Maximum maximum = new Maximum();
        int max = (int)maximum.testMaxValue(4, 6, 5,3,2);
        Assert.assertEquals(6, max);
    }


    @Test
    public void givenMaxValue_atPos3_shouldReturn_sameNumber() {
        Maximum maximum = new Maximum();
        Comparable max=maximum.testMaxValue(4,5,6,3,2);
        Assert.assertEquals(6, max);
    }
    @Test
    public void givenMaxValue_atPos4_shouldReturn_sameNumber() {
        Maximum maximum = new Maximum();
        int max = (int)maximum.testMaxValue(4, 5,3,6,2);
        Assert.assertEquals(6, max);
    }

    @Test
    public void givenMaxValueFloat_atPos1_shouldReturn_sameNumber() {
        Maximum maximum = new Maximum();
        Comparable max = maximum.testMaxValue(6.5F, 4.5F, 5.5F,3.5F,2.5F);
        Assert.assertEquals(6.5F,max);
    }

    @Test
    public void givenMaxValueFloat_atPos2_shouldReturn_sameNumber() {
        Maximum maximum = new Maximum();
        Comparable max = maximum.testMaxValue(4.5F, 6.5F, 5.5F,3.5F,2.5F);
        Assert.assertEquals(6.5F, max);

    }

    @Test
    public void givenMaxValueFloat_atPos3_shouldReturn_sameNumber() {
        Maximum maximum = new Maximum();
        Comparable max = maximum.testMaxValue(4.5F, 5.5F, 6.5F,3.5F,2.5F);
        Assert.assertEquals(6.5F,max);

    }
    @Test
    public void givenMaxValueFloat_atPos4_shouldReturn_sameNumber() {
        Maximum maximum = new Maximum();
        Comparable max = maximum.testMaxValue(4.5F, 5.5F, 3.5F,6.5F,2.5F);
        Assert.assertEquals(6.5F,max);

    }

    @Test
    public void givenMaxString_atPos1_shouldReturn_sameString() {
        Maximum maximum=new Maximum();
       String max=(String) maximum.testMaxValue("Banana","Apple","Peach","Cherries");
        Assert.assertEquals("Peach",max);
    }
    @Test
    public void givenMaxString_atPos2_shouldReturn_sameString() {
        Maximum maximum=new Maximum();
        String max=(String) maximum.testMaxValue("Apple","Banana","Peach","Cherries");
        Assert.assertEquals("Peach",max);
    }
    @Test
    public void givenMaxString_atPos3_shouldReturn_sameString() {
        Maximum maximum=new Maximum();
        String max= (String) maximum.testMaxValue("Apple","Peach","Banana","Cherries");
        Assert.assertEquals("Peach",max);
    }

    @Test
    public void givenMaxString_atPos4_shouldReturn_sameString() {
        Maximum maximum=new Maximum();
        String max= (String) maximum.testMaxValue("Apple","Peach","Cherries","Banana");
        Assert.assertEquals("Peach",max);
    }


}






