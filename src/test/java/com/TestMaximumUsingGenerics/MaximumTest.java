package com.TestMaximumUsingGenerics;

import org.junit.Assert;
import org.junit.Test;


    public class MaximumTest {
        @Test
        public void givenMaxValue_atPos1_shouldReturn_sameNumber() {
            Maximum maximum =new Maximum();
            int maxNumber=maximum.testMaxValue(6,4,5);
            Assert.assertEquals(6,maxNumber);
        }

        @Test
        public void givenMaxValue_atPos2_shouldReturn_sameNumber() {
            Maximum maximum=new Maximum();
            int maxNumber=maximum.testMaxValue(4,6,5);
            Assert.assertEquals(6,maxNumber);
        }

        @Test
        public void givenMaxValue_atPos3_shouldReturn_sameNumber() {
            Maximum maximum=new Maximum();
            int maxNumber=maximum.testMaxValue(4,5,6);
            Assert.assertEquals(6,maxNumber);
        }
    }


