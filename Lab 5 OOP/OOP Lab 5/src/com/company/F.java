package com.company;

public class F extends E{

    // Inheritance: the class F extends E

    // This class has the String property f
    protected String f;

    public F(String a, X x) {
        super(a, x);
        this.f = a;
    }

    // print it in console in a clever way
    @Override
    public String toString() {
        return "F { " +
                "f = '" + f + '\'' +
                ", x = " + x.toString() +
                " }\n" + super.toString();
    }

}
