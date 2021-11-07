package com.company;

import java.util.ArrayList;

public class Hospital {
    // The class Hospital which contains the next properties:
    // name of type String
    private String name;
    // address of type Address, which is a new class
    private Address address;
    // phone of type Phone, which is a new class
    private Phone phone;
    // The relation one to many between Hospital and Department
    // Create an arraylist of Department in the Hospital
    private ArrayList<Department> departments;
}
