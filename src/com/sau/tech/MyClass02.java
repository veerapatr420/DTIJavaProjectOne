package com.sau.tech;

import java.util.Scanner;

public class MyClass02 {
    public static void main(String[] args) {
    String empName;
    double empSalary, tax10;

    Scanner sc = new Scanner(System.in);

    System.out.print("Input employee name:");
    empName = sc.next();
    System.out.print("Input employee salary: ");
    empSalary = sc.nextDouble();

    System.out.println("-----------------------------------------");

    tax10 = empSalary *10 / 100 ;
    System.out.println("Your name: " + empName);
    System.out.println("Your Salary: " + empSalary);
    System.out.println("TAX pay: " + tax10 + " Bath ");
    }
}
