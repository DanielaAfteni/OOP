package com.company;

public class D extends C{

    // Inheritance: the class D extends C

    // This class has the String property d
    protected String d;

    // In class D create also a state with the same name x as in class A and give another initial value
    protected X x = new X("X at D");

    public D(String a, X x) {
        super(a, x);
        this.d = a;
    }

    // print it in console in a clever way
    @Override
    public String toString() {
        return "D { " +
                "d = '" + d + '\'' +
                ", x = " + x.toString() +
                " }\n" + super.toString();
    }

}
