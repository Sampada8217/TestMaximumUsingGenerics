package com.TestMaximumUsingGenerics;

public class Maximum<E extends  Comparable<E>> {
    E x;
    E y;
    E z;
    public Maximum(E x ,E y, E z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public Maximum() {

    }

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





