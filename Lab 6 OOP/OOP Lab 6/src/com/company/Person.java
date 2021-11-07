package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Person {
    // The class Person which contains the next properties:
    // title of type String
    private String title;
    // givenName of type String
    private String givenName;
    // middleName of type String
    private String middleName;
    // familyName of type String
    private String familyName;
    // name of type FullName, which is a new class
    private FullName name;
    // birthDate of type Date, which was imported
    private Date birthDate;
    // gender of type Gender, which represents an enum with 2 possible variants: Male, Female
    private Gender gender;
    // homeAddress of type Address, which is a new class
    private Address homeAddress;
    // phone of type Phone, which is a new class
    private Phone phone;
    // The relation many to many between Person and Hospital
    // Firstly create an arraylist of Hospital in the Person
    private ArrayList<Hospital> hospitals;

    // Create some methods where we use the array of Hospital
    public ArrayList<Hospital> getHospitals() {
        return this.hospitals;
    }

    // Create a method that adds a hospital in the arraylist of Hospital
    public void addHospitals(Hospital hospital) {
        this.hospitals.add(hospital);
    }
}

// The type of Gender, that defines the enum which has 2 options: Male and Female
enum Gender {
    Male,
    Female
}
