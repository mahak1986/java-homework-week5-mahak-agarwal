package javaprogrammes5;

import java.util.ArrayList;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Programme_6_RetrieveElement {
    public static void main(String[] args) {
        retrieve(2);// Specify the index to retrieve an element
    }

    public static void retrieve(int index) { //Params int index
        ArrayList<String> list = new ArrayList();
        list.add("Life");
        list.add("Is");
        list.add("Beautiful");
        list.add("Every");
        list.add("Moment");
        //retrieving an element (at a specified index) from a given array list
        //using if else
        if (index >= 0 && index <= list.size()) {
            //Retrieves the element at the specified index in the
            // ArrayList and stores it in the variable element
            String element = list.get(index);
            System.out.println("Element at index " + index + " is: " + element);
        } else {
            System.out.println("Index is out of bounds.");
        }
    }
}
