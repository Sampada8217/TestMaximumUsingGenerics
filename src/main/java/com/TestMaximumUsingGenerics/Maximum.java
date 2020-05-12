package com.TestMaximumUsingGenerics;

public class Maximum<E extends  Comparable<E>> {
    E[] elements;

    @SafeVarargs
    public Maximum(E... elements){
        this.elements=elements;

    }

    @SafeVarargs
    public static <E extends  Comparable<E>> E testMaxValue(E ... elements) {
        E max = elements[0];
        for (E element : elements) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public static <E extends Comparable<E> > void printMax(){
        System.out.println("Max Integer="+testMaxValue(4,5,6,3,2));
        System.out.println("Max Float="+testMaxValue(4.5F,5.5F,6.5F,3.5F,2.5F));
        System.out.println("Max String="+testMaxValue("Apple","Banana","Peach","Cherries"));
    }
    public static void main(String[] args) {
        printMax();
    }

}





