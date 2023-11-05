package javaprogrammes5;

import java.util.Arrays;
import java.util.Collections;

/**
 * Write a Java program to reverse an array of integer values.
 */
public class Programme_3_ReverseArray {

    public static void main(String[] args) {
        Integer [] arr = {50,60,80,60,30};
         reverseArr(arr);
    }
    public static void reverseArr(Integer [] a ){
        //Used to reverse the order of elements in an array
        Collections.reverse(Arrays.asList(a));
        //Printing the list of array in the console
        System.out.println(Arrays.asList(a));
    }
    }
