public class Manager extends staff {

    public Manager(String name, String lastName, int baseSalary, dateOfHire) {
        super(name, lastName, baseSalary, dateOfHire);
    }

    @Override

    public setName(String name) {
        this.name = name;
    }

    @Override

    public setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override

    public setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override

    public setDateOfHire(dateOfHire dateOfHire) {
        this.dateOfHire = dateOfHire;
    }

    @Override

    public String toString() {
        return "Manager{" +
                "name ='" + name + '\'' +
                ", lastName ='" + lastName + '\'' +
                ", baseSalary = " + baseSalary +
                ", dateOfHire = " + dateOfHire +
                '}';
    }

}
