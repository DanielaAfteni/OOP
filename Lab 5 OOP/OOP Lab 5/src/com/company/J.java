package com.company;

public class J extends I{

    // Inheritance: the class J extends I

    // This class has the String property j
    protected String j;

    public J(String a, X x) {
        super(a, x);
        this.j = a;
    }

    // print it in console in a clever way
    @Override
    public String toString() {
        return "J { " +
                "j = '" + j + '\'' +
                " }\n" + super.toString();
    }

}
