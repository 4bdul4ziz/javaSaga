package com.example;
import javafx.application.Application; import javafx.scene.Scene;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.StackPane; import javafx.stage.Stage;
public class progressIndicator extends Application{
public void start(Stage primaryStage) throws Exception {
ProgressIndicator PI=new ProgressIndicator();
PI.setProgress(0.75f);
StackPane root = new StackPane(); root.getChildren().add(PI);
Scene scene = new Scene(root,300,200); primaryStage.setScene(scene);
primaryStage.setTitle("Progress Indicator Example");
primaryStage.show();
}
public static void main(String[] args) { launch(args); }
}