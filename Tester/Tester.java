package Tester;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); // in = input

        // System.out.print("Hello, how old are you?: ");
        // int age = in.nextInt();

        // System.out.print("Please enter the unit price: ");
        // double unitPrice = in.nextInt();

        // System.out.print("Please enter the number of cans");
        // int cans = in.nextInt();

        /**
         * System.out.print("Please enter the number of cans: ");
         * 
         * Console window:
         * Please enter the number of cans
         */
        int myNum = 23;
        System.out.printf("myNum: %10d\n", myNum);
        /**
         * Sample run:
         * Console window:
         * myNum: 23.
         */

        System.out.println("Quiero ver que pasa " + myNum);

        double myDouble = 23;
        System.out.printf("myDouble: %10.2f\n", myDouble);
        /**
         * Sample run:
         * Console window:
         * myDouble: 23.00.
         */

        System.out.println("Quiero ver que pasa " + myNum);

        String myName = "FZ";
        System.out.printf("myName: %5s.\n", myName);
        /**
         * Sample run:
         * Console window:
         * myName: FZ.
         */
        // System.out.println();
        System.out.println("Quiero ver que pasa " + myNum);
    }
}
/**
 * Sample run - Terminal:
 * Please enter the unit price: 23.5
 * Exception in thread "main" java.util.InputMismatchException
 */