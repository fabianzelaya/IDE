package Customer;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String firstName = read.nextLine();
        String SecondName = read.nextLine();
        int age = read.nextInt();
        int roomNumber = read.nextInt();

        Customer customer = new Customer();
        // set customer's data to object here

        customer.firstName = firstName;
        customer.SecondName = SecondName;
        customer.age = age;
        customer.roomNumber = roomNumber;

        customer.saveCustomerInfo();
    }
}

class Customer {
    // add all necessary attributes here
    String firstName;
    String SecondName;
    int age;
    int roomNumber;

    public void saveCustomerInfo() {
        System.out.println("First name: " + firstName);
        System.out.println("Second name: " + SecondName);
        System.out.println("Age: " + age);
        System.out.println("Room number: " + roomNumber);
    }
}
// FZ

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
