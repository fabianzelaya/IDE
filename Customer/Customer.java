package Customer;

public class Customer {
    // add all necessary attributes here
    String firstName;
    String SecondName;
    int age;
    int roomNumber;

    public Customer(String firstName, String SecondName, int age, int roomNumber) {
        this.firstName = firstName;
        this.SecondName = SecondName;
        this.age = age;
        this.roomNumber = roomNumber;
    }

    public void getCustomerInfo() {
        System.out.println("First name: " + firstName);
        System.out.println("Second name: " + SecondName);
        System.out.println("Age: " + age);
        System.out.println("Room number: " + roomNumber);
    }
}
// FZ