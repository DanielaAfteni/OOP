package com.example.oop_lab_9;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

// PART 1
// Create an application which will allow the user to calculate the division between 2 numbers.

public class HelloApplication extends Application {

    // The application will have some labels, one button and 2 text fields
    // 2 labels indicating the place near to which we will insert the numbers for division: number 1 and 2
    public Label lblEnteredN1 = new Label("Enter n1: ");
    public Label lblEnteredN2 = new Label("Enter n2: ");
    // 2 text fields where we will insert the number 1 and 2
    public TextField textNum1 = new TextField();
    public TextField textNum2 = new TextField();
    // one button that represents the calculation - division
    public Button btnDivision = new Button("/");
    // label for the location of the final result
    public Label lblDivision = new Label("Division: ");
    // label for the display of the final result
    public Label lblDisplayDiv = new Label();;
    // 2 labels for the error display, in case if they appear
    public Label lblEnteredError = new Label("If there are errors: ");
    public Label lblDisplayError = new Label();

    @Override
    public void start(Stage stage) throws IOException {
        // creation of the pane
        GridPane myPane = new GridPane();
        // the scene of the corresponding length parameters
        Scene scene = new Scene(myPane, 600, 300);
        // the title of the scene
        stage.setTitle("Division between 2 numbers");
        stage.setScene(scene);
        stage.show();
        // we add to our pane the next labels for the division: numbers, button, result and error
        // All the inputs should allow to write any symbol from the keyboard
        myPane.add(lblEnteredN1, 0, 0);
        myPane.add(textNum1, 1, 0);
        myPane.add(lblEnteredN2, 0, 1);
        myPane.add(textNum2, 1, 1);
        myPane.add(lblDivision,0,2);
        myPane.add(lblDisplayDiv, 1,2);
        myPane.add(btnDivision,2,2);
        myPane.add(lblEnteredError, 0,3);
        myPane.add(lblDisplayError,1,3);

        // we put all in the center of the pane
        myPane.setAlignment(Pos.CENTER);

        btnDivision.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                // we use try catch to catch the exceptions
                try {
                    // in case if we have missing input (one number or both) then we throw a new exception
                    if((textNum2.getText().length() == 0) || (textNum1.getText().length() == 0)) {
                        throw new MissingInput();
                    }

                    // initially, it was the case when the first number was missing
                    else if(textNum1.getText().length() == 0)
                        lblDisplayDiv.setText("" + (0.0 / Double.parseDouble(textNum2.getText())));

                    // initially, it was the case when the second number was missing
                    else if(textNum2.getText().length() == 0)
                        lblDisplayDiv.setText("" + (0.0 / Double.parseDouble(textNum1.getText())));

                    // if the second number is equal to 0
                    else if(Double.parseDouble(textNum2.getText()) == 0) {
                        // then we throw an exception
                        // and send a suitable message in the error label
                        throw new DivisionByZero();
                    }

                    // After knowing the values for the second input (divisor)
                    // we should throw an UnluckyException in case its value is 13
                    else if(Double.parseDouble(textNum2.getText()) == 13) {
                        throw new UnluckyException();
                    }

                    else
                        lblDisplayDiv.setText("" + (Double.parseDouble(textNum1.getText()) / Double.parseDouble(textNum2.getText())));

                }
                // in case there will be any errors regarding the validation of the form
                // it should show the error message in the error label
                catch (NumberFormatException invalidFormat) {
                    lblDisplayError.setText("The corresponding input is written wrong!");
                }
                catch (MissingInput missingInput){
                    // in case of missing input then in error label will we sent the
                    lblDisplayError.setText(missingInput.message);
                }
                catch (DivisionByZero divisionByZero){
                    // in case if the second number is equal to 0, we send to error label a corresponding message
                    lblDisplayError.setText(divisionByZero.message);
                }
                catch (UnluckyException unluckyException) {
                    // in case if the second value is equal to 13, we send the message to the error label
                    lblDisplayError.setText(unluckyException.message);
                }
            }
        });
    }

    public static void main(String[] args) {
        launch();
    }
}