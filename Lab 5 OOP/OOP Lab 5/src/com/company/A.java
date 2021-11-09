package com.company;

// PART 1
// Create 10 classes with their names as first 10 alphabetical letters

public class A {

    // Each class should have their own String property with corresponding letter as their reference
    // This class has the String property a
    protected String a;

    // Add initial value to state X from class A
    protected X x = new X("X at A");

    // Add a instance variable of X type to A class as a state and modify the constructor of A
    public A(String a, X x) {
        this.a = a;
        this.x = x;
    }

    // print it in console in a clever way
    @Override
    public String toString() {
        return "A { " +
                "a = '" + a + '\'' +
                ", x = " + x.toString() +
                " }\n";
    }

}
