package com.company;

public class Lab8_part1 {

    public static void main(String[] args) {

        // PART 2
        // The need to create a list of geometric bodies for the usage of the class FigureController

        GeometricBody cub = new Cub();
        GeometricBody sphere = new Sphere();
        GeometricBody parallelepiped = new Parallelepiped();

        // The actual list of geometric bodies, which contains: cub, sphere, parallelepiped
        GeometricBody[] geometricBodies = {cub, sphere, parallelepiped};

        // Call the methods from this FigureController
        System.out.println(GeometricBodyController.getBiggestVolume(geometricBodies));
        System.out.println("\n");
        System.out.println(GeometricBodyController.getBiggestSurface(geometricBodies));
    }
}
