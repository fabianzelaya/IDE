package com.fabianzelaya.employee;

/**
 * Declare a class Manager that inherits from the class Employee and adds an
 * instance variable
 * 
 * Bonus for storing a salary bonus. Omit constructors and methods.
 * 
 */

public class Manager extends Employee {
    // bonus for storing a salary bonus.
    private double salaryBonus;
    private double baseSalary;
    private String name;

    // Omit constructors and methods.
    public Manager(String name, double baseSalary, double salaryBonus) {
        super(name, baseSalary);
        this.salaryBonus = salaryBonus;
    }

    public void setSalaryBonus(double salaryBonus) {
        this.salaryBonus = salaryBonus;
    }

    public double getSalaryBonus() {
        return salaryBonus;
    }

    public double getSalary() {
        return super.getSalary() + salaryBonus;
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
}
// FZ