/*
 *
 * Using javaFX design a login form that contains fields to get the student details Name, Registration Number, Department (DropDown), Semester (DropDown), CGPA. When the submit button is pressed all the details entered by the student should be printed in the console.
 */

package com.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class LoginForm extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(25, 25, 25, 25));

        Label nameLabel = new Label("Name");
        nameLabel.setStyle("-fx-font: 20 verdana;");
        gridPane.add(nameLabel, 0, 0);

        TextField nameTextField = new TextField();
        nameTextField.setStyle("-fx-font: 20 verdana;");
        gridPane.add(nameTextField, 1, 0);

        Label regNoLabel = new Label("Registration Number");
        regNoLabel.setStyle("-fx-font: 20 verdana;");
        gridPane.add(regNoLabel, 0, 1);

        TextField regNoTextField = new TextField();
        regNoTextField.setStyle("-fx-font: 20 verdana;");
        gridPane.add(regNoTextField, 1, 1);

        Label departmentLabel = new Label("Department");
        departmentLabel.setStyle("-fx-font: 20 verdana;");
        gridPane.add(departmentLabel, 0, 2);

        ComboBox<String> departmentComboBox = new ComboBox<>();
        departmentComboBox.getItems().addAll("CSE", "ECE", "EEE", "MECH", "CIVIL");
        departmentComboBox.setStyle("-fx-font: 20 verdana;");
        gridPane.add(departmentComboBox, 1, 2);


        Label semesterLabel = new Label("Semester");
        semesterLabel.setStyle("-fx-font: 20 verdana;");
        gridPane.add(semesterLabel, 0, 3);

        ComboBox<String> semesterComboBox = new ComboBox<>();
        semesterComboBox.getItems().addAll("1", "2", "3", "4", "5", "6", "7", "8");
        semesterComboBox.setStyle("-fx-font: 20 verdana;");
        gridPane.add(semesterComboBox, 1, 3);

        Label cgpaLabel = new Label("CGPA");
        cgpaLabel.setStyle("-fx-font: 20 verdana;");
        gridPane.add(cgpaLabel, 0, 4);

        TextField cgpaTextField = new TextField();
        cgpaTextField.setStyle("-fx-font: 20 verdana;");
        gridPane.add(cgpaTextField, 1, 4);

        Button submitButton = new Button("Submit");
        submitButton.setStyle("-fx-font: 20 verdana;");
        gridPane.add(submitButton, 1, 5);

        submitButton.setOnAction(event -> {
            System.out.println("Name: " + nameTextField.getText());
            System.out.println("Registration Number: " + regNoTextField.getText());
            System.out.println("Department: " + departmentComboBox.getValue());
            System.out.println("Semester: " + semesterComboBox.getValue());
            System.out.println("CGPA: " + cgpaTextField.getText());
        });

        Scene scene = new Scene(gridPane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Login Form");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}





