package com.stackroute.PE3;

public class StringException {

    public static void main(String[] args) {
            try {
                int a[] = new int[10];
                //Array has only 10 elements
                a[11] = 9;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBounds");
            }

//null pointer exception
            try {
                String str = null;
                System.out.println(str.length());
            } catch (NullPointerException e) {
                System.out.println("NullPointerException..");
            }

//negative array exception
            try {
                int arrSize = -8;
                int[] myArray = new int[arrSize];
            } catch (NegativeArraySizeException e) {
                System.out.println("Can't create array of negative size");
            }
        }
}

