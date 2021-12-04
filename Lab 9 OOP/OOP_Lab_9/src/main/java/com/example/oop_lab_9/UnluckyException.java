package com.example.oop_lab_9;

// PART 3
// Create an own exception UnluckyException which should extend from Exception
// We should send a message in case if second value is 13

public class UnluckyException extends Exception{
    protected String message = "It is not possible to have divisor equal to 13!";

    public UnluckyException() {
    }
}
