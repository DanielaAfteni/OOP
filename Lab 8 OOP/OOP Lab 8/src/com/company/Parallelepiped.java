package com.company;

// PART 1
// child classes of GeometricBody - Parallelepiped

// When the base class has been changed into an interface,
// we have changed the "extends" word into "implements"

public class Parallelepiped implements GeometricBody{

    // Which is forced to implement the getSurface method (with a = 5, b = 6, c = 7)
    @Override
    public double getSurface() {
        return 2 * (5 * 6 + 6 * 7 + 7 * 5) ;
    }

    // Which is forced to implement the getVolume method (with a = 5, b = 6, c = 7)
    @Override
    public double getVolume() {
        return 7 * 5 * 6;
    }

    // Which is forced to implement the getName method
    @Override
    public String getName() {
        return "Parallelepiped";
    }
}
