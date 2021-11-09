package com.company;

public class X {

    // Create class X which has a private String name property that should have also a constructor for that X

    private String x;

    // constructor for that X with a private String x
    public X(String x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "X { " +
                "x = '" + x + '\'' +
                " }";
    }

}


