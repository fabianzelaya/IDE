/**
 * @author Fabian Zelaya
 * @created on Mon Aug 1, 2022
 */

public class Staff {
    private String name;
    private String lastName;
    private double baseSalary;
    private int dateOfHire;

    public Staff(String name, String lastName, double baseSalary, int dateOfHire) {
        this.name = name;
        this.lastName = lastName;
        this.baseSalary = baseSalary;
        this.dateOfHire = dateOfHire;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getDateOfHire() {
        return dateOfHire;
    }

    public void setDateOfHire(int dateOfHire) {
        this.dateOfHire = dateOfHire;
    }

    public String toString() {
        return "staff{" +
                "name ='" + name + '\'' +
                ", lastName ='" + lastName + '\'' +
                ", baseSalary = " + baseSalary +
                ", dateOfHire = " + dateOfHire +
                '}';
    }
}

public class Manager extends Staff {

    public Manager(String name, String lastName, double baseSalary, int dateOfHire) {
        super(name, lastName, baseSalary, dateOfHire);
    }

    public setName(){
        super.setName(name);
    }

    public setName(String name) {
        this.name = name;
    }

    public setLastName(){
        super.setLastName(lastName);
    }

    public setLastName(String lastName) {
        this.lastName = lastName;
    }

    public setBaseSalary(){
        super.setBaseSalary(baseSalary);
    }

    public setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public setDateOfHire(){
        super.setDateOfHire(dateOfHire);
    }

    public setDateOfHire(int dateOfHire) {
        this.dateOfHire = dateOfHire;
    }

    public String toString() {
        return "Manager{" +
                "name ='" + name + '\'' +
                ", lastName ='" + lastName + '\'' +
                ", baseSalary = " + baseSalary +
                ", dateOfHire = " + dateOfHire +
                '}';
    }
}
// FZ