package com.example;
import java.io.FileInputStream; import java.io.FileNotFoundException;
import javafx.application.Application; import javafx.scene.Scene;
import javafx.scene.control.Label; import javafx.scene.image.Image;
import javafx.scene.image.ImageView; import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class LabelImage extends Application {
@Override
public void start(Stage primaryStage) throws FileNotFoundException {
StackPane root = new StackPane();
FileInputStream input= new FileInputStream("E:/Balasundaram.jpg");
Image image = new Image(input);
ImageView imageview=new ImageView(image);
Label my_label=new Label("Dr. Balasundaram A", imageview);
Scene scene=new Scene(root,500,500);
root.getChildren().add(my_label);
primaryStage.setScene(scene);
primaryStage.setTitle("Label Image Example");
primaryStage.show();
}
public static void main(String[] args) { launch(args); }
}