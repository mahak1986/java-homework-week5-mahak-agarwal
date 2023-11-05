package javaprogrammes5;
/**
 * Declare following two arraylist in java and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 */

import java.util.ArrayList;

public class Programme_11_Compare {
    public static void main(String[] args) {
        m1();
    }

    public static void m1() {
        //Declare ArrayList 1
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        //Declare ArrayList 2
        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        //Compare the ArrayLists
        boolean areEqual = c1.equals(c2);
        if (areEqual) {
            System.out.println("c1 and c2 are equal");
        } else
            System.out.println("c1 and c2 are not equal");
    }
}
