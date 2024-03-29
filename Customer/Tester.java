package Customer;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first name: ");
        String firstName = input.nextLine();

        System.out.println("Enter second name: ");
        String secondName = input.nextLine();

        System.out.println("Enter age: ");
        int age = input.nextInt();

        System.out.println("Enter room number: ");
        int roomNumber = input.nextInt();

        System.out.println("\nHere is the customer info: ");
        Customer customer = new Customer(firstName, secondName, age, roomNumber);
        customer.getCustomerInfo();
    }
}
//FZ

/**
 * You are the administrator of a hotel and must create customer information
 * cards for your new customers. On the card, you must note the customer’s first
 * and last name, age, and room number.
 * 
 * The program you are given takes a guest's data (first name, last name, age,
 * and room number) as input.
 * 
 * Complete the class by adding corresponding attributes so that the
 * saveCustomerInfo() method works correctly. Also assign taken data values to
 * attributes of created object.
 * 
 * Sample Input
 * John
 * Smith
 * 35
 * 204
 * 
 * Sample Output
 * First name: John
 * Second name: Smith
 * Age: 35
 * Room number: 204
 * 
 * Be attentive to set correct data types for attributes.
 * 
 */
