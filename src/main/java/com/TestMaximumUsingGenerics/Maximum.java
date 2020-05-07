package com.TestMaximumUsingGenerics;

public class Maximum<E extends  Comparable<E>> {
 E[] elements;
    public Maximum(E... elements){
        this.elements=elements;

    }
    public Maximum() {

    }

    public static <E extends  Comparable<E>> E testMaxValue(E ... elements) {
        E max = elements[0];
        for (E element : elements) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

}





