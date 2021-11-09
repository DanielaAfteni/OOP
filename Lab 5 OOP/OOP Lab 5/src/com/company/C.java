package com.company;

public class C extends B{

    // Inheritance: the class C extends B

    // This class has the String property c
    protected String c;

    public C(String a, X x) {
        super(a, x);
        this.c = a;
    }

    // print it in console in a clever way
    @Override
    public String toString() {
        return "C { " +
                "c = '" + c + '\'' +
                ", x = " + x.toString() +
                " }\n" + super.toString();
    }

}
