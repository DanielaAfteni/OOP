package com.company;

// PART 1
// child classes of GeometricBody - Sphere

// When the base class has been changed into an interface,
// we have changed the "extends" word into "implements"

public class Sphere implements GeometricBody{

    // Which is forced to implement the getSurface method (with r = 4)
    @Override
    public double getSurface() {
        return 4 * Math.PI * 4 * 4;
    }

    // Which is forced to implement the getVolume method (with r = 4)
    @Override
    public double getVolume() {
        return 4 * Math.PI * 4 * 4 * 4 / 3;
    }

    // Which is forced to implement the getName method
    @Override
    public String getName() {
        return "Sphere";
    }
}
