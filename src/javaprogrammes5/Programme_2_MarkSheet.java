package javaprogrammes5;

import java.util.Scanner;

/**
 *
 *  * Write a java program to input student Name, roll No, and three subjects Math, Science and
 *  * English marks (marks is between, 0 to 100 and if it is out of range print error message “Invalid
 *  * Input, Marks should between, 0 to 100”) and find out total, percentage and result.
 *  * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 *  * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 *  * _______________________________
 *  * |                               |
 *  * | Mark Sheet                    |
 *  * |_______________________________|
 *  * | Name : Jay                    |
 *  * | Roll No: 08                   |
 *  * |_______________________________|
 *  * | Subjects : Marks              |
 *  * |_______________________________|
 *  * | Math : 98                     |
 *  * | Science : 90                  |
 *  * | English : 85                  |
 *  * |_______________________________|
 *  * | Total : 273                   |
 *  * |_______________________________|
 *  * | Percentage : 91.0             |
 *  * | Result : Pass                 |
 *  * | Grade : A+                    |
 *  * |______________________________
 */

public class Programme_2_MarkSheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            marks(scanner);
            System.out.print("Do you want to enter data for another student? (yes/no): ");
            String choice = scanner.next().toLowerCase();
            if (!choice.equals("yes")) {
                System.out.println("Exiting the program.");
                break;
            }
            scanner.close();
        }
    }

    public static void marks(Scanner scanner) {
        System.out.print("Enter Student Name: ");
        String StudentName = scanner.next();
        System.out.print("Enter Roll Number: ");
        int RollNumber = scanner.nextInt();
        System.out.print("Enter Maths Marks(1-100): ");
        int mathsMarks = scanner.nextInt();
        System.out.print("Enter Science Marks(1-100): ");
        int scienceMarks = scanner.nextInt();
        System.out.print("Enter English Marks(1-100): ");
        int englishMarks = scanner.nextInt();
        if ((mathsMarks > 100 || mathsMarks < 0) || (scienceMarks > 100 || scienceMarks < 0) || (englishMarks > 100 || englishMarks < 0)) {
            System.out.print("Invalid scanner. Marks should be between 0 and 100.");
            // return;
        }

        // Calculate total and percentage
        int totalMarks = mathsMarks + scienceMarks + englishMarks;
        System.out.println("Total Marks: " + totalMarks);
        double percentage = (totalMarks / 300.0) * 100;
        System.out.println("Percentage: " + percentage);

        // Determine result (pass/fail) and assign a grade
        String result = (percentage >=35 && mathsMarks<35 && scienceMarks<35 && englishMarks<35) ? "Pass" : "Fail";
        String grade;
        if (percentage >= 35) ;
        result = "Pass";
        System.out.println("The result is: " + result);

        if (percentage <=100 && percentage>= 80) {
            grade = "A+";
            System.out.println("The grade is: "+grade);
        } else if (percentage <80 && percentage>= 60) {
            grade = "A";
            System.out.println("The grade is: "+grade);
        } else if (percentage < 60 && percentage >= 50) {
            grade = "B";
            System.out.println("The grade is: "+grade);
        } else if (percentage < 50 && percentage >= 35) {
            grade = "C";
            System.out.println("The grade is: "+grade);
        } else {
            result = "Fail";
            System.out.println("The result is: " + result);
            grade = "Not Applicable";
            System.out.println("The grade is: " + grade);
        }

        System.out.println("___________________________________");
        System.out.println("|                                  |");
        System.out.println("|         Mark Sheet               |");
        System.out.println("|__________________________________|");
        System.out.println("| Name : " + StudentName + "       |");
        System.out.println("| Roll No : " + RollNumber + "     |");
        System.out.println("|__________________________________|");
        System.out.println("| Subjects : Marks                 |");
        System.out.println("|__________________________________|");
        System.out.println("| Math : " + mathsMarks + "        |");
        System.out.println("| Science : " + scienceMarks + "   |");
        System.out.println("| English : " + englishMarks + "   |");
        System.out.println("|__________________________________|");
        System.out.println("| Total : " + totalMarks + "       |");
        System.out.println("|__________________________________|");
        System.out.println("| Percentage : " + String.format("%.1f", percentage) + "   |");
        System.out.println("| Result : " + result + "          |");
        System.out.println("| Grade : " + grade + "            |");
        System.out.println("|__________________________________|");
    }
}

