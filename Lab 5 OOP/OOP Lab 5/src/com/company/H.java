package com.company;

public class H extends G{

    // Inheritance: the class H extends G

    // This class has the String property h
    protected String h;

    // Do the same in class H and add to a state x another initial value
    // the property x from class H should be private
    private X x = new X("X at H");

    public H(String a, X x) {
        super(a, x);
        this.h = a;
    }

    // print it in console in a clever way
    @Override
    public String toString() {
        return "H { " +
                "h = '" + h + '\'' +
                ", x = " + x.toString() +
                " }\n" + super.toString();
    }
}
