package com.example;
import javafx.application.Application; import javafx.scene.Scene;
import javafx.scene.control.Button; import javafx.scene.control.Label;
import javafx.scene.control.TextField; import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane; import javafx.stage.Stage;
public class LoginPass extends Application {
public static void main(String[] args) { launch(args); }
public void start(Stage primaryStage) throws Exception {
Label user_id=new Label("User ID");
Label password = new Label("Password");
//set font to verdana
user_id.setStyle("-fx-font: 20 verdana;");
password.setStyle("-fx-font: 20 verdana;");

TextField tf=new TextField();
PasswordField pf=new PasswordField();
pf.setPromptText("Enter Password");
Button b = new Button("Submit");
b.setOnAction(e->System.out.println("User_ID: "+tf.getText()+" "+
"Password: "+pf.getText()));
GridPane root = new GridPane();
root.addRow(0, user_id, tf);
root.addRow(1, password, pf);
root.addRow(5, b);
Scene scene=new Scene(root,300,200);
primaryStage.setScene(scene);
primaryStage.setTitle("PasswordField Example");
primaryStage.show();
}
}