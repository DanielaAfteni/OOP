package com.example.oop_lab_9;

// PART 2
// We should catch the errors from input missing values, arithmetic errors and number parsing from input values.
// So I created my own exception, that extends the Exception class

public class MissingInput extends Exception{

    // In case if we catch a missing input exception then we sent the corresponding message
    protected String message = "The input is missing!";

    public MissingInput() {
    }
}
