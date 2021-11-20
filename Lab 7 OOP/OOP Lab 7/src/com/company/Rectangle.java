package com.company;

// PART 1
// child classes of Figure - Rectangle

public class Rectangle extends Figure{

    // Which is forced to implement the getArea method
    @Override
    double getArea() {
        return 250;
    }

    // Which is forced to implement the getPerimeter method
    @Override
    double getPerimeter() {
        return 300;
    }

    // Which is forced to implement the getName method
    @Override
    String getName() {
        return "Rectangle";
    }
}
