package com.company;

// PART 2
// The class FigureController

public class FigureController {

    // Which has a method that takes as parameter a list of Figures and return the one with the biggest area
    public static String getBiggestArea(Figure[] figures) {
        // Set the initial string result as the name of the first figure, square
        String biggestFigureByArea = figures[0].getName();
        // Set the initial biggest area result as the area of the first figure, square
        double biggestArea = figures[0].getArea();
        // While we iterate each figure from the list
        for (Figure figure: figures) {
            // In case if the biggest area result is smaller than the area of another figure
            if(biggestArea < figure.getArea()) {
                // then we define the biggest area result equal to the current biggest area
                biggestArea = figure.getArea();
                // and define the initial string result as the name of this figure
                biggestFigureByArea = figure.getName();
            }
        }
        // We return the result, including the name and the value of the biggest area
        return "The figure with the biggest area is " + biggestFigureByArea + " with the corresponding value " + biggestArea;
    }

    // Which has a method that takes as parameter a list of Figures and return the one with the biggest perimeter
    public static String getBiggestPerimeter(Figure[] figures) {
        // Set the initial string result as the name of the first figure, square
        String biggestFigureByParameter = figures[0].getName();
        // Set the initial biggest perimeter result as the perimeter of the first figure, square
        double biggestPerimeter = figures[0].getPerimeter();
        // While we iterate each figure from the list
        for (Figure figure: figures) {
            // In case if the biggest perimeter result is smaller than the perimeter of another figure
            if(biggestPerimeter < figure.getPerimeter()) {
                // then we define the biggest perimeter result equal to the current biggest perimeter
                biggestPerimeter = figure.getPerimeter();
                // and define the initial string result as the name of this figure
                biggestFigureByParameter = figure.getName();
            }
        }
        // We return the result, including the name and the value of the biggest perimeter
        return "The figure with the biggest perimeter is " + biggestFigureByParameter + " with the corresponding value " + biggestPerimeter;
    }
}
