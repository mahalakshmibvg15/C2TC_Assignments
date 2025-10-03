package com.tnsif.assignmentone.utilities;

import com.tnsif.assignmentone.employees.Employee;

public class EmployeeUtilities {
	public static void printEmployeeDetails(Employee emp) {
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Salary: " + emp.getSalary());
    }

    /**
     * Gives a raise to an employee by percentage.
     * Demonstrates modification through public setters.
     */
    public static void giveRaise(Employee emp, double percent) {
        double newSalary = emp.getSalary() + (emp.getSalary() * percent / 100);
        emp.setSalary(newSalary);
        System.out.println(emp.getName() + " has received a " + percent + "% raise. New Salary: " + emp.getSalary());
    }

}
