package com.example;
import javafx.application.Application; import javafx.scene.Scene;
import javafx.scene.layout.BorderPane; import javafx.scene.control.*;
import javafx.stage.Stage;
//set style to verdana
//set font size to 20

public class MenuItems extends Application {
public static void main(String[] args) { launch(args); }
public void start(Stage primaryStage) throws Exception {
BorderPane root = new BorderPane();

Scene scene = new Scene(root,300,300);
MenuBar menubar = new MenuBar();
Menu FileMenu = new Menu("File");
FileMenu.setStyle("-fx-font: 20 verdana;");
MenuItem filemenu1=new MenuItem("new");
MenuItem filemenu2=new MenuItem("Save");
MenuItem filemenu3=new MenuItem("Exit");
filemenu1.setStyle("-fx-font: 20 verdana;");
filemenu2.setStyle("-fx-font: 20 verdana;");
filemenu3.setStyle("-fx-font: 20 verdana;");

Menu EditMenu=new Menu("Edit");
EditMenu.setStyle("-fx-font: 20 verdana;");

MenuItem EditMenu1=new MenuItem("Cut");
MenuItem EditMenu2=new MenuItem("Copy");
MenuItem EditMenu3=new MenuItem("Paste");
EditMenu1.setStyle("-fx-font: 20 verdana;");
EditMenu2.setStyle("-fx-font: 20 verdana;");
EditMenu3.setStyle("-fx-font: 20 verdana;");

EditMenu.getItems().addAll(EditMenu1,EditMenu2,EditMenu3);
root.setTop(menubar);
FileMenu.getItems().addAll(filemenu1,filemenu2,filemenu3);
menubar.getMenus().addAll(FileMenu,EditMenu);
primaryStage.setScene(scene);
primaryStage.show();
}
}
