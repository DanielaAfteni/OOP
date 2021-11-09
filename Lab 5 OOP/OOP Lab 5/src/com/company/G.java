package com.company;

public class G extends F{

    // Inheritance: the class G extends F

    // This class has the String property g
    protected String g;

    public G(String a, X x) {
        super(a, x);
        this.g = a;
    }

    // print it in console in a clever way
    @Override
    public String toString() {
        return "G { " +
                "g = '" + g + '\'' +
                ", x = " + x.toString() +
                " }\n" + super.toString();
    }

}
