package com.company;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class MathematicalExpression {

    // PART 1

    private String text;

    MathematicalExpression(String text) {
        this.text = text;
    }

    // int function responsible for the analysis and final result according to the parentheses, if they are alright or not
     String parenthesesAlright() {
        // Initially, we set the final string result as negative one
         String finResult = "Mathematical expression is not correct.";
         ArrayList<String> listOfArray = new ArrayList<String>();
         // While we are going through the all length of the mathematical expression
         for(int i = 0; i < text.length(); i++)
         {
             // if we meet a char character witch is a parentheses turned to the left, then we add it to the list of array
             if(text.charAt(i) == '(') listOfArray.add(Character.toString(text.charAt(i)));
             else
             {
                 // in case if we meet a char character witch is a parentheses turned to the right
                 if(text.charAt(i) == ')')
                 {
                     // and if the length of the list of array is not equal to 0 and if the previous element is equal to a parentheses turned to the left and  the current one is a parentheses turned to the right
                     // then we will remove from the list of array, the previous element that is a parentheses turned to the left
                     if((listOfArray.size() != 0) && (listOfArray.get(listOfArray.size()-1).equals("(")) && (text.charAt(i) == ')')) listOfArray.remove(listOfArray.size()-1);
                     // else we just say that it is not correct
                     else return finResult = "Mathematical expression is not correct.";
                 }
             }
         }
         // Finally, if we removed all parentheses, then we should not have any elements in the list of array
         // In case if we succeeded then we would say that the parentheses are written correctly
         if(listOfArray.isEmpty()) return finResult = "Mathematical expression is correct.";
         // We return the final element
         return finResult;
    }
}
