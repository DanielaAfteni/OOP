package com.example.oop_lab_9;

// PART 2
// We should catch the errors from arithmetic errors as division by 0
// So I created my own exception, that extends the Exception class

public class DivisionByZero extends Exception{

    // In case if we catch a missing input exception then we sent the corresponding message
    protected String message = "Division by 0 is forbidden!";

    public DivisionByZero() {
    }
}
