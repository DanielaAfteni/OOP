package com.company;

// PART 1
// child classes of Figure - Triangle

public class Triangle extends Figure{

    // Which is forced to implement the getArea method
    @Override
    double getArea() {
        return 80;
    }

    // Which is forced to implement the getPerimeter method
    @Override
    double getPerimeter() {
        return 150;
    }

    // Which is forced to implement the getName method
    @Override
    String getName() {
        return "Triangle";
    }
}
