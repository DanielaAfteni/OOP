package com.company;

public class Lab7_part1 {

    public static void main(String[] args) {

        // PART 2
        // The need to create a list of figures for the usage of the class FigureController
        Figure square = new Square();
        Figure rectangle = new Rectangle();
        Figure triangle = new Triangle();

        // PART 3
        // Create a new Figure (Circle) without declaring a class separately, directly in main function - using Anonymous class concept
        Figure circle = new Figure() {

            // Which has implemented the getArea method
            @Override
            double getArea() {
                return 10 * 10 * Math.PI;
            }

            // Which has implemented the getPerimeter method
            @Override
            double getPerimeter() {
                return 2 * 10 * Math.PI;
            }

            // Which has implemented the getName method
            @Override
            String getName() {
                return "Circle";
            }
        };

        // Call and print in console the area and perimeter of this newly object
        System.out.println(circle.getName());
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println("\n");

        // The actual list of figures, which contains: square, rectangle, triangle, later and the circle
        // Add the circle object to the list of figures
        Figure[] figures = {square, rectangle, triangle, circle};

        // Call the methods from this FigureController
        System.out.println(FigureController.getBiggestArea(figures));
        System.out.println(FigureController.getBiggestPerimeter(figures));
    }
}

