package com.company;

// PART 1
// Base abstract class GeometricBody

// PART 3
// Change the abstract class GeometricBody to a interface
// Resolve any errors if occurred (erase the abstract word in front of each method )

interface GeometricBody {

    // with the following abstract methods - getSurface()
    // which should return the surface of some geometric body
    // When the class has been changed into an interface,
    // we have taken off the "abstract" word
    double getSurface();

    // with the following abstract methods - getVolume()
    // which should return the surface of some geometric body
    // we have taken off the "abstract" word
    double getVolume();

    // extra String method for printing the corresponding name of the geometric body
    // we have taken off the "abstract" word
    String getName();
}
