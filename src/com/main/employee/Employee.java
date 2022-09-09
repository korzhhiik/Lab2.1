package com.main.employee;

/*
Be careful!
Mutable and not-thread-safe object that always modifies state itself.
 */
public class Employee {
    private final String firstName;
    private final String lastName;
    private EmployeePosition employeePosition = EmployeePosition.DEFAULT;
    private int yearsOfExperience;
    private double salary;
    private double tax;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public EmployeeView calculateTaxBasedOnYearsOfExperience(int yearsOfExperience, EmployeePosition position) {
        this.employeePosition = position;
        this.yearsOfExperience = yearsOfExperience;

        switch (yearsOfExperience) {
            case 1 -> {
                this.tax = 2.5;
                switch (position) {
                    case ADMIN -> this.salary = 1000;
                    case SELLER -> this.salary = 500;
                    case MANAGER -> this.salary = 800;
                    case DIRECTOR ->
                            throw new IllegalStateException("Director must be at least with 5 years of experience");
                }
            }
            case 2 -> {
                this.tax = 2.0;
                switch (position) {
                    case ADMIN -> this.salary = 2000;
                    case SELLER -> this.salary = 800;
                    case MANAGER -> this.salary = 1300;
                    case DIRECTOR ->
                            throw new IllegalStateException("Director must be at least with 3 years of experience");
                }
            }
            default -> {
                if (yearsOfExperience > 2) {
                    calculateSalaryAndTaxDependingOnYears(yearsOfExperience, position);
                }
            }
        }
        return new EmployeeView(this.salary, this.tax);
    }

    private void calculateSalaryAndTaxDependingOnYears(int years, EmployeePosition position) {
        double taxCounter = 2.0;
        if (position.equals(EmployeePosition.DIRECTOR)) {
            this.salary += 5000;
        }
        for (int i = 2; i < years; i++) {
            if (taxCounter > 0) {
                taxCounter -= 0.5;
            }
            this.salary *= 2;
            this.tax = taxCounter;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employeePosition=" + employeePosition +
                ", salary=" + salary +
                ", tax='" + tax + '\'' +
                '}';
    }

    record EmployeeView(double salary, double tax) {
    }
}
