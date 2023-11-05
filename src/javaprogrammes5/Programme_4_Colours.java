package javaprogrammes5;
/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */

import java.util.ArrayList;

public class Programme_4_Colours {

    public static void main(String[] args) {
        colours();
    }

    public static void colours() {
        // Create a new ArrayList to store colors
        ArrayList<String> colourList = new ArrayList();
        colourList.add("Black");
        colourList.add("Blue");
        colourList.add("Red");
        colourList.add("Green");
        colourList.add("White");
        colourList.add("Yellow");
        // Print out the collection using a for-each loop
        System.out.println("Colors in the ArrayList:");
        for (String colour : colourList) {
            System.out.println(colour);
        }
    }
}
