package com.company;

import java.io.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class Lab4_part1 {
    public static void main(String[] args) throws IOException {

        // PART 1

        // Firstly, we read the txt file from a specific location and set is as a filePath
        String filePath = "C:\\Users\\user\\Desktop\\OOP Lab 4\\one_expression.txt";

        System.out.println("The first mathematical expression from the one_expression.txt file:");
        // We show the mathematical expression from the file
        // And call the function that buffers the text that we read
        System.out.println(usingBufferedReader(filePath));

        MathematicalExpression mathematicalExpression = new MathematicalExpression(usingBufferedReader(filePath));

        // Set the final result according to the parentheses, whether they are alright or not
        String finalResult = mathematicalExpression.parenthesesAlright();
        // Display the conclusion about parentheses
        System.out.println(finalResult);

        System.out.println("\n");

        // PART 2

        // Secondly, we read the txt file with 3 expressions from a specific location and set is as a filePath3
        String filePath3 = "C:\\Users\\user\\Desktop\\OOP Lab 4\\three_expressions.txt";
        System.out.println("The next 3 lines represent: the second, third and fourth mathematical expressions from the three_expressions.txt file:");
        // We show the all 3 mathematical expressions from the file
        // And call the function that buffers the text that we read
        System.out.println(usingBufferedReader(filePath3));
        System.out.println("\n");

         MathematicalExpression mathematicalExpression1 = new MathematicalExpression(usingBufferedReader(filePath3));
         String finalResult1 = mathematicalExpression1.parenthesesAlright();
         System.out.println("The first mathematical expresion:");
         System.out.println(finalResult1);
         System.out.println("\n");


        // With the new method readString(), we can take only a single line to read a file’s content into String.
        Path fileName1 = Path.of("three_expressions.txt");
        String content1  = "2. 2x - 3y + 25 / (-((29*4-2) + 32) -14 - (2+5)*12";
        Files.writeString(fileName1, content1);

        String actual1 = Files.readString(fileName1);
        // We show the mathematical expression from the file
        System.out.println(actual1);

        MathematicalExpression mathematicalExpression2 = new MathematicalExpression(actual1);
        // Set the final result according to the parentheses, whether they are alright or not
        String finalResult2 = mathematicalExpression2.parenthesesAlright();
        // Display the conclusion about parentheses
        System.out.println(finalResult2);

        // With the new method readString(), we can take only a single line to read a file’s content into String.
        Path fileName2 = Path.of("three_expressions.txt");
        String content2  = "3. ((((((((((((((((((((2x-4y * 98 )))))))))))))))))))))";
        Files.writeString(fileName2, content2);

        System.out.println("\n");

        String actual2 = Files.readString(fileName2);
        // We show the mathematical expression from the file
        System.out.println(actual2);

        MathematicalExpression mathematicalExpression3 = new MathematicalExpression(actual2);
        // Set the final result according to the parentheses, whether they are alright or not
        String finalResult3 = mathematicalExpression3.parenthesesAlright();
        // Display the conclusion about parentheses
        System.out.println(finalResult3);
    }

    //Read file content into the string with - using BufferedReader and FileReader
    // It reads the file one line at a time and returns the content
    private static String usingBufferedReader(String filePath) {
        StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                contentBuilder.append(sCurrentLine).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contentBuilder.toString();
    }
}


