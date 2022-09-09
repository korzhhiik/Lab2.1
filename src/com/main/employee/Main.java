package com.main.employee;

public class Main {
    public static void main(String[] args) {
        var employee = new Employee("Eugene", "Lisa");
        Employee.EmployeeView employeeView = employee.calculateTaxBasedOnYearsOfExperience(1, EmployeePosition.ADMIN);
    }
}
