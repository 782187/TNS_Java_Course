package com.tnsif.dayfour;

public class Employee {
    String name;
    static double salary;
    static String companyName;

    //Static Block
    static {
        companyName = "Avis";
    }

    //Parameterized Constructor
    public Employee(String name,double salary){
        this.name = name;
        this.salary = salary;
    }

    void show(){
        System.out.println("\nName: " + name + ", Salary " + salary + ", Company Name: " + companyName);
    }


}
