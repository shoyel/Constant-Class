package com.syntexpro.traning;

import java.util.Scanner;

public class CalculatorDemo {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("welcome to my own calculator");

        System.out.println("Please enter any integer number");
       int numberOne = input.nextInt(); //
        System.out.println("Please enter another integer number");

        int numberTwo = input.nextInt();

        int result = numberOne + numberTwo;
        System.out.println("Final results = " +result);

    }
}
