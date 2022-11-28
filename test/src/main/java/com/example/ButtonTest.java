package com.example;
import java.io.FileInputStream;
import javafx.application.Application; import javafx.event.ActionEvent;
import javafx.event.EventHandler; import javafx.scene.Scene;
import javafx.scene.control.Button; import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image; import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane; import javafx.stage.Stage;
public class ButtonTest extends Application {
public void start(Stage primaryStage) throws Exception {
FileInputStream input=new FileInputStream(
"E:/Balasundaram.jpg");
Image image = new Image(input); ImageView img=new ImageView(image);
DropShadow shadow = new DropShadow();
StackPane root = new StackPane();
Button btn=new Button(); btn.setEffect(shadow);
btn.setGraphic(img); btn.setWrapText(true);
btn.setOnAction(new EventHandler<ActionEvent>() {
public void handle(ActionEvent arg0) {
System.out.println("Button clicked");
}
} );
Scene scene=new Scene(root,500,500);
root.getChildren().add(btn);
primaryStage.setScene(scene);
primaryStage.setTitle("Button Class Example");
primaryStage.show();
}
public static void main(String[] args) { launch(args); }
}