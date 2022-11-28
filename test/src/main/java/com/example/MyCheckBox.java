package com.example;
import javafx.application.Application; import javafx.scene.Scene;
import javafx.scene.control.CheckBox; import javafx.scene.control.Label;
import javafx.scene.layout.VBox; import javafx.stage.Stage;
public class MyCheckBox extends Application {
public static void main(String[] args) { launch(args); }
public void start(Stage primaryStage) throws Exception {
Label l = new Label("Tick you Favorite Player ");
CheckBox c1 = new CheckBox("Virat Kohli");
CheckBox c2 = new CheckBox("Sachin Tendulkar");
CheckBox c3 = new CheckBox("Rohit Sharma");
CheckBox c4 = new CheckBox("Rahul Dravid");
VBox root = new VBox();
root.getChildren().addAll(l,c1,c2,c3,c4);
root.setSpacing(5);
Scene scene=new Scene(root,200,200);
primaryStage.setScene(scene);
primaryStage.setTitle("CheckBox Example");
primaryStage.show();
}
}