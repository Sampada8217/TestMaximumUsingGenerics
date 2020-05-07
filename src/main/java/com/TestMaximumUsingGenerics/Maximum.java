package com.TestMaximumUsingGenerics;

public class Maximum<E extends  Comparable<E>> {

    public E testMaxValue(E x, E y, E z) {
        E maxNumber = z;

        if (y.compareTo(maxNumber) > 0) {
            maxNumber = y;

        } else if (x.compareTo(maxNumber) > 0) {
            maxNumber = x;
        } else
            maxNumber = z;

        return maxNumber;
    }
}





