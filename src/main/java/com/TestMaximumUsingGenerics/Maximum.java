package com.TestMaximumUsingGenerics;

public class Maximum {

    public Integer testMaxValue(Integer x, Integer y, Integer z) {
        Integer maxNumber = z;

        if (y.compareTo(maxNumber) > 0) {
            maxNumber = y;

        } else if (x.compareTo(maxNumber) > 0) {
            maxNumber = x;
        } else
            maxNumber = z;

        return maxNumber;
    }


    public static Float testMaxFloatValue(Float a, Float b, Float c) {
        Float maxNumberFloat = c;

        if (b.compareTo(maxNumberFloat) > 0) {
            maxNumberFloat = b;

        } else if (a.compareTo(maxNumberFloat) > 0) {
            maxNumberFloat = a;
        } else
            maxNumberFloat = c;

        return maxNumberFloat;
    }
}




