package com.example;
import javafx.application.Application;
import javafx.scene.Scene; import javafx.scene.control.Label;
import javafx.scene.layout.StackPane; import javafx.stage.Stage;
public class LabelTest extends Application {
@Override
public void start(Stage primaryStage) throws Exception {
// TODO Auto-generated method stub

Label my_label=new Label("Dr. Balasundaram A");
//set font to verdana
my_label.setStyle("-fx-font: 20 verdana;");
StackPane root = new StackPane();
Scene scene=new Scene(root,500,500);
root.getChildren().add(my_label);
primaryStage.setScene(scene);
primaryStage.setTitle("Label Class");
primaryStage.show();
}
public static void main(String[] args) { launch(args); }
}