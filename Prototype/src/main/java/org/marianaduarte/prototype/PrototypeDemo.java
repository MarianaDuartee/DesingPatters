package org.marianaduarte.prototype;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrototypeDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Employee id:");
        int employeeId = Integer.parseInt(br.readLine());
        System.out.println("\n");

        System.out.println("Enter Employee name:");
        String employeeName = br.readLine();
        System.out.println("\n");

        System.out.println("Enter Employee designation:");
        String employeeDesignation = br.readLine();
        System.out.println("\n");

        System.out.println("Enter Employee address:");
        String employeeAddress= br.readLine();
        System.out.println("\n");

        System.out.println("Enter Employee salary:");
        double employeeSalary = Double.parseDouble(br.readLine());
        System.out.println("\n");

        EmployeeRecord employee1 = new EmployeeRecord(employeeId,employeeName,employeeDesignation,employeeSalary,employeeAddress);
        employee1.showRecord();
        System.out.println("\n");

        EmployeeRecord employee2 = (EmployeeRecord) employee1.getClone();
        employee2.showRecord();
        System.out.println("\n");

    }
}
