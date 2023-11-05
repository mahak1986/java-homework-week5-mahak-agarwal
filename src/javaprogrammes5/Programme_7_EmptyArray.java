package javaprogrammes5;

import java.util.ArrayList;

/**
 * Write a Java program to test if an array list is empty or not.
 */
public class Programme_7_EmptyArray {
    public static void main(String[] args) {
        empty();
    }

    public static void empty() {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList();
        //Check if list is empty
        if (list.isEmpty()) {
            System.out.println("List is empty!");
        } else
            System.out.println("List in not empty");
        //Adding some elements to the list
        list.add("Good");
        list.add("Morning");

        //Check again if list is empty
        if (list.isEmpty()) {
            System.out.println("List is empty!");
        } else
            System.out.println("List is not empty");
    }
}
