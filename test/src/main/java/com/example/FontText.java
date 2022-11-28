package com.example;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class FontText extends Application{
public void start(Stage primaryStage) throws Exception {
// TODO Auto-generated method stub
Text text = new Text();
text.setX(200); text.setY(40);
text.setFont(Font.font("Verdana", 20));
text.setText("Hello Rahul!!");
text.setStrikethrough(true);
Text text1=new Text(); text1.setX(100); text1.setY(140);
text1.setText("JavaFX Welcome Dr. Bala");
text1.setFont(Font.font("Verdana",25));
text1.setFill(Color.BROWN);
text1.setUnderline(true);
Group root = new Group();
Scene scene = new Scene(root,500,200);
root.getChildren().addAll(text,text1);
primaryStage.setScene(scene);
primaryStage.setTitle("Text Example");
primaryStage.show();
}                       
public static void main(String[] args) { launch(args); }
}
