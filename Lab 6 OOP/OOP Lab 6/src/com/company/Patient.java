package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends Person{
    // Inheritance: the class Patient extends Person
    // It contains the next properties:
    // id of type String
    private String id;
    // name of type FullName, which is a new class
    private FullName name;
    // gender of type Gender, which represents an enum with 2 possible variants: Male, Female
    private Gender gender;
    // birthDate of type Date, which was imported
    private Date birthDate;
    // age of type Integer
    private Integer age;
    // accepted of type Date, which was imported
    private Date accepted;
    // sickness of type History, which is a new class
    private History sickness;
    // prescriptions of type String
    private String[] prescriptions;
    // allergies of type String
    private String[] allergies;
    // specialReqs of type String
    private String[] specialReqs;

    // The relation many to many between Patient and OperationsStaff
    // Firstly create an arraylist of OperationsStaff in the Patient
    private ArrayList<OperationsStaff> operationsStaffs;

    // Create some methods where we use the array of OperationsStaff
    public ArrayList<OperationsStaff> getOperationsStaff() {
        return this.operationsStaffs;
    }

    // Create a method that adds an operationsStaff in the arraylist of OperationsStaff
    public void addOperationsStaff(OperationsStaff operationsStaff) {
        this.operationsStaffs.add(operationsStaff);
    }
}
