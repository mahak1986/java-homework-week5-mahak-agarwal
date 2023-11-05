package javaprogrammes5;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterator
 */
public class Programme_5_Iterator {

    public static void main(String[] args) {
        iteration();
    }

    public static void iteration() {
        // Create an ArrayList of integers
        ArrayList<Integer> num = new ArrayList();
        // Add some elements to the ArrayList
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        // Create an Iterator to iterate through the ArrayList
        Iterator<Integer> iterator = num.iterator();//Use Iterator to loop through the elements
        while (iterator.hasNext()) { //Integer number = iterator.next();
            System.out.print(iterator.next() + " ");
        }

    }

}
