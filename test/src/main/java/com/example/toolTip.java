package com.example;
import javafx.application.Application; import javafx.scene.Scene;
import javafx.scene.control.PasswordField; import javafx.scene.control.Tooltip;
import javafx.scene.layout.StackPane; import javafx.stage.Stage;
public class toolTip extends Application {
public void start(Stage primaryStage) throws Exception {
PasswordField pf = new PasswordField();
Tooltip tool=new Tooltip();
StackPane root = new StackPane();
tool.setText("Information");
pf.setTooltip(tool);
root.getChildren().add(pf);
Scene scene = new Scene(root,300,200);
primaryStage.setScene(scene);
primaryStage.setTitle("ToolTip Example");
primaryStage.show();
}
public static void main(String[] args) { launch(args); }
}