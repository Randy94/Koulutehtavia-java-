package application;

import controller.Kontrolleri;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import model.Noppa;

 // Amir Dahina 12.2.2020
public class NoppaGUI extends Application{
    Kontrolleri kontrolleri;
    
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void init() {
       
    }
   
 
    @Override
    public void start(Stage primaryStage) {
        try {
            HBox root = new HBox(4);
            root.setAlignment(Pos.CENTER);
            Label text = new Label("");
            
            Noppa noppa = new Noppa(6);
            
            kontrolleri = new Kontrolleri(text,noppa);
            
            primaryStage.setTitle("Noppa - MVC");
           
            Button nappi = new Button("Heita noppaa");
            
            nappi.setOnAction(kontrolleri::heitetty1);
            
            root.getChildren().addAll(nappi,text);
            
            primaryStage.setScene(new Scene(root,500,200));
            
            
            primaryStage.show();
           
        }catch(Exception e) {
            e.printStackTrace();
        }
       
       
    }
}
