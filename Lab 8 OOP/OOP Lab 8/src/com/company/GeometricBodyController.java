package com.company;

// PART 2
// The class GeometricBodyController

public class GeometricBodyController {

    // Which has a method that takes as parameter a list of GeometricBody and return the one with the biggest volume
    public static String getBiggestVolume(GeometricBody[] geometricBodies) {
        // Set the initial string result as the name of the first geometric body, cub
        String biggestGeoBodyByVolume = geometricBodies[0].getName();
        // Set the initial biggest volume result as the volume of the first figure, cub
        double biggestVolume = geometricBodies[0].getVolume();
        // While we iterate each geometric body from the list
        for (GeometricBody geometricBody: geometricBodies) {
            // In case if the biggest volume result is smaller than the volume of another geometric body
            if(biggestVolume < geometricBody.getVolume()) {
                // then we define the biggest volume result equal to the current biggest volume
                biggestVolume = geometricBody.getVolume();
                // and define the initial string result as the name of this geometric body
                biggestGeoBodyByVolume = geometricBody.getName();
            }
        }
        // We return the result, including the name and the value of the biggest volume
        return "The geometric body with the biggest volume is " + biggestGeoBodyByVolume + " with the corresponding value " + biggestVolume;
    }

    // Which has a method that takes as parameter a list of GeometricBody and return the one with the biggest surface
    public static String getBiggestSurface(GeometricBody[] geometricBodies) {
        // Set the initial string result as the name of the first geometric body, cub
        String biggestGeoBodyBySurface = geometricBodies[0].getName();
        // Set the initial biggest surface result as the perimeter of the first geometric body, cub
        double biggestSurface = geometricBodies[0].getSurface();
        // While we iterate each geometric body from the list
        for (GeometricBody geometricBody: geometricBodies) {
            // In case if the biggest surface result is smaller than the surface of another geometric body
            if(biggestSurface < geometricBody.getSurface()) {
                // then we define the biggest surface result equal to the current biggest surface
                biggestSurface = geometricBody.getSurface();
                // and define the initial string result as the name of this geometric body
                biggestGeoBodyBySurface = geometricBody.getName();
            }
        }
        // We return the result, including the name and the value of the biggest surface
        return "The geometric body with the biggest surface is " + biggestGeoBodyBySurface + " with the corresponding value " + biggestSurface;
    }
}
