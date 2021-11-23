package com.company;

// PART 1
// child classes of GeometricBody - Cub

// When the base class has been changed into an interface,
// we have changed the "extends" word into "implements"

public class Cub implements GeometricBody{

    // Which is forced to implement the getSurface method (with a = 5)
    @Override
    public double getSurface() {
        return 6 * 5 * 5;
    }

    // Which is forced to implement the getVolume method (with a = 5)
    @Override
    public double getVolume() {
        return 5 * 5 * 5;
    }

    // Which is forced to implement the getName method
    @Override
    public String getName() {
        return "Cub";
    }
}
