package com.company;

public class E extends D{

    // Inheritance: the class E extends D

    // This class has the String property e
    protected String e;

    public E(String a, X x) {
        super(a, x);
        this.e = a;
    }

    // print it in console in a clever way
    @Override
    public String toString() {
        return "E { " +
                "e = '" + e + '\'' +
                ", x = " + x.toString() +
                " }\n" + super.toString();
    }

}
