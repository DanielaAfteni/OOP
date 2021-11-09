package com.company;

public class B extends A{

    // Each next class inherits from previous letter class:
    // Inheritance: the class B extends A

    // This class has the String property b
    protected String b;

    public B(String a, X x) {
        // used the specific hint with super
        super(a, x);
        this.b = a;
    }

    // print it in console in a clever way
    @Override
    public String toString() {
        return "B { " +
                "b = '" + b + '\'' +
                ", x = " + x.toString() +
                " }\n" + super.toString();
    }

}
