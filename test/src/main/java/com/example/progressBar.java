package com.example;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class progressBar extends Application {
public void start(Stage primaryStage) throws Exception {
StackPane root = new StackPane();
ProgressBar pb = new ProgressBar();
// progress.setProgress(0.5f);
root.getChildren().add(pb);
Scene scene = new Scene(root,300,200);
primaryStage.setScene(scene);
primaryStage.setTitle("Progress Bar Example");
primaryStage.show();
}
public static void main(String[] args) { launch(args); }
}