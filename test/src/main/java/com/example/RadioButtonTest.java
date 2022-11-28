package com.example;
import javafx.application.Application;
import javafx.scene.Scene; import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox; import javafx.stage.Stage;
public class RadioButtonTest extends Application {
public static void main(String[] args) { launch(args); }
public void start(Stage primaryStage) throws Exception {
ToggleGroup group = new ToggleGroup();
RadioButton button1 = new RadioButton("Mango");
RadioButton button2 = new RadioButton("Apple");
RadioButton button3 = new RadioButton("Banana");
RadioButton button4 = new RadioButton("Orange");
Label l = new Label("Select any One Fruit ");
button1.setToggleGroup(group);
button2.setToggleGroup(group);
button3.setToggleGroup(group);
button4.setToggleGroup(group);
VBox root=new VBox();
root.setSpacing(10);
root.getChildren().addAll(l,button1,button2,button3,button4);
Scene scene=new Scene(root,400,300);
primaryStage.setScene(scene);
primaryStage.setTitle("Radio Button Example");
primaryStage.show();
}
}