package com.syntexpro.traning;

import java.awt.*;
import java.util.Date;

public class DataTypes {
    public static void main(String[] args) {

        // byte MyByte = 20; //[-128 to 127]
        //byte b = -129;

        //short MyShort = 31; //[-128 to 127]

        int ViewCount = 123_456_789;// in real life after 3 digit put underscore

        //System.out.println(ViewCount);

        //long
        long myLongNumber = 3_123_456_789L; // long number mentioned always uppercase L

        float shirtPrice = 10.99F; // max 6 digit
        double hatPrice = 10.123456789012345; // max 15 digit

        char myPattern = '&'; //single character

        boolean isEggStock = false;

       // System.out.println(isEggStock);

        //Reference type
        Date now = new Date(); // create instance, object creation


         Point point1 = new Point(1, 1);
         Point point2 = point1;
        //System.out.println(point1);
        //System.out.println(point2);
        //Point point2 = point1;

        /*non-primitive: for storing complex objects. Class,Arrays

         */

        String message = new String("hello World" + "!!");
        //System.out.println(message);

        String message1 = "Hello World" + "!!";
        //System.out.println(message1.toUpperCase());

        String myName = "   Shoyel   ";
        //System.out.println(myName);
       // System.out.println(myName.trim());

        //Concatination

        String learn = "How are you";
        //System.out.println(learn.indexOf("r"));
        //System.out.println(learn.indexOf("a"));

        // in real life we use int, double, boolean 5 star, double 4 star, char and long 3 star,


        String myWorld = "how is your life ??";
        //System.out.println(myWorld.endsWith("M")); //false
       // System.out.println(myWorld.endsWith("??")); //true
       // System.out.println(myWorld.startsWith("??")); //false
        //System.out.println(myWorld.length());
        //System.out.println(myWorld.indexOf("h"));
       // System.out.println(myWorld.replace("??", "!!"));
        System.out.println(myWorld.toUpperCase());

        String myName1 = "     Shoyel    ";
        System.out.println(myName1);
        System.out.println(myName1.trim());







    }


}
