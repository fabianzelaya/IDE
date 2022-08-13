package Customer;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        String name = reader.nextLine();
        String SecondName = reader.nextLine();
        int age = reader.nextLine();
        int roomNumber = reader.nextLine();

        Customer customer = new Customer();
        customer.name = name;
        customer.SecondName = SecondName;
        customer.age = age;
        customer.roomNumber = roomNumber;

        customer.saveCustomerInfo();
    }
}
