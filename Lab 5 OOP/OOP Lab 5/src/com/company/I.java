package com.company;

public class I extends H{

    // Inheritance: the class I extends H

    // This class has the String property i
    protected String i;

    public I(String a, X x) {
        super(a, x);
        this.i = a;
    }

    // print it in console in a clever way
    @Override
    public String toString() {
        return "I { " +
                "i = '" + i + '\'' +
                " }\n" + super.toString();
    }

}
