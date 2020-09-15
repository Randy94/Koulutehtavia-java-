package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
// Amir Dahina 12.2.2020

public class TervehdysGUI extends Application {
	public static void main(String[] args){
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Tervehdyksiä");
			GridPane grid = new GridPane();
			
			Button aamunappi = new Button("Aamu");
			Button Paivanappi = new Button("Paiva");
			Button iltanappi = new Button("Ilta");
			Button yönappi = new Button("yö");
			
			aamunappi.setOnAction(new EventHandler<ActionEvent>() {


				@Override
				public void handle(ActionEvent event) {
					System.out.println("Hyvää huomenta!");
					Text txt = new Text("Hyvää huomenta!");
					txt.setFont(Font.font("Arial", FontWeight.BOLD,20));
					BorderPane.setAlignment(txt, Pos.CENTER);
					grid.add(txt, 4, 0);
			}
			});
			
			
			Paivanappi.setOnAction(new EventHandler<ActionEvent>() {


				@Override
				public void handle(ActionEvent event) {
					System.out.println("Hyvää Päivää!");
					Text txt = new Text("Hyvää Päivää!");
					txt.setFont(Font.font("Arial", FontWeight.BOLD,20));
					BorderPane.setAlignment(txt, Pos.CENTER);
					grid.add(txt, 4, 1);
			}
			});

			
			iltanappi.setOnAction(new EventHandler<ActionEvent>() {


				@Override
				public void handle(ActionEvent event) {
					System.out.println("Hyvää Iltaa!");
					Text txt = new Text("Hyvää Iltaa!");
					txt.setFont(Font.font("Arial", FontWeight.BOLD,20));
					BorderPane.setAlignment(txt, Pos.CENTER);
					grid.add(txt, 4, 2);
			}
			});

			
			yönappi.setOnAction(new EventHandler<ActionEvent>() {


				@Override
				public void handle(ActionEvent event) {
					System.out.println("Hyvää yötä!");
					Text txt = new Text("Hyvää yötä!");
					txt.setFont(Font.font("Arial", FontWeight.BOLD,20));
					BorderPane.setAlignment(txt, Pos.CENTER);
					grid.add(txt, 4, 3);
			}
			});

			
			grid.setAlignment(Pos.CENTER);
			grid.setHgap(10);
			grid.setVgap(10);
			grid.setPadding(new Insets(25,25,25,25));
			
			grid.add(aamunappi, 0, 1);
			grid.add(Paivanappi, 1, 1);
			grid.add(iltanappi, 2, 1);
			grid.add(yönappi, 3, 1);
			
			primaryStage.setScene(new Scene(grid,700,250));
			primaryStage.show();
	} catch (Exception e) {
		e.printStackTrace();
	
	}
	
}
}
		
