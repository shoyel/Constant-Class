package com.syntexpro.traning;

import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) {

        // when your length is 4 but index is 3 since java start from 0 index if we try to assign we get an error out of bound


            int[] numbers = new int[5]; // this arrays is fixed, kind of old syntex.
            numbers[0] = 1; //0
            numbers[1] = 2; //1
                            //2 0 when we do not assign value then results will be 0 in index for int, 0, null string
            numbers[3] = 3;
                            //4 0 when we do not assign value then results will be 0 in index
           // System.out.println(Arrays.toString(numbers)); // to run Arrays we need to use Arrays class.

            String[] message1 = new String[3];
            message1[1] = "Shahjalal";
       // System.out.println(Arrays.toString(message1));

        boolean[] isColdToday = new boolean[3];
        isColdToday[1]= true;
        //System.out.println(Arrays.toString(isColdToday));

        //Modern way Arrays

        int[] listOfNumbers = {1, 2, 3, 4,};
        //System.out.println(Arrays.toString(listOfNumbers));
        System.out.println(listOfNumbers[3]);

        int[] listOfNumbers1 = {3,1,5,2};
        Arrays.sort(listOfNumbers1);
        System.out.println(Arrays.toString(listOfNumbers1)); // arrays are fixed value


    }

}
