package com.company;

// PART 1
// child classes of Figure - Square

public class Square extends Figure{

    // Which is forced to implement the getArea method
    @Override
    double getArea() {
        return 140;
    }

    // Which is forced to implement the getPerimeter method
    @Override
    double getPerimeter() {
        return 200;
    }

    // Which is forced to implement the getName method
    @Override
    String getName() {
        return "Square";
    }
}
