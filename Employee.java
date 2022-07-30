/**
 * This class represents an employee. Also follows the question instructions #7
 * from the chapter 9 Self-Check exercise.
 */

// Suppose the class Employee is declared as follows:
public class Employee {
    // instance variables
    private String name;
    private double baseSalary;

    // constructors
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getSalary() {
        return baseSalary;
    }
}
// FZ