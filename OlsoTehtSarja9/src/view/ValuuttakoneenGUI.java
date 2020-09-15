package view;

import controller.ValuuttakoneenOhjain;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Valuuttakone;



public class ValuuttakoneenGUI extends Application implements IValuuttakoneenUI {

	
	


	private Stage primaryStage;
	Valuuttakone valuuttakone = new Valuuttakone();
	ValuuttakoneenOhjain ohjain = new ValuuttakoneenOhjain(valuuttakone, this);
	ListView<String> valuuttayks;
	ListView<String> valuuttakaks;
	TextField maara;
	TextField tulos;
	
	
	public void start(Stage primarystage) {
		this.primaryStage = primarystage;
		primarystage.setTitle("Valuuttakone");
		
		
		GridPane root = new GridPane();
		root.setPadding(new Insets(10,10,10,10));
		root.setVgap(10);
		root.setHgap(10);
		
		
		Scene scene = new Scene(root, 800, 200);
		
		 valuuttayks = new ListView<String>();
		 valuuttayks.setPrefSize(250, 250);
		 
		 ObservableList<String> valuuttavasen = FXCollections.observableArrayList();
		 valuuttavasen.addAll(ohjain.getValuutat());
		 valuuttayks.setItems(valuuttavasen);
		 valuuttayks.getSelectionModel().select(0);
		 
		 VBox valuuttaboxvasen = new VBox();
		 valuuttaboxvasen.getChildren().addAll(new Label("Mistä"),valuuttayks);
		 GridPane.setConstraints(valuuttaboxvasen,0,0);
		 root.getChildren().add(valuuttaboxvasen); 
		 
		 
		
		 valuuttakaks = new ListView<String>();
		 valuuttakaks.setPrefSize(250, 250);
		 
		 ObservableList<String> valuuttaoikea = FXCollections.observableArrayList();
		 valuuttaoikea.addAll(ohjain.getValuutat());
		 valuuttakaks.setItems(valuuttaoikea);
		 valuuttakaks.getSelectionModel().select(0);
		 
		VBox valuuttaboxoikea = new VBox();
		valuuttaboxvasen.getChildren().addAll(new Label("Mihin"),valuuttakaks);
		GridPane.setConstraints(valuuttaboxoikea,1,0);
		root.getChildren().add(valuuttaboxoikea); 
		
		
		maara = new TextField();
		Button muunna = new Button("Muunna");
		muunna.setPrefWidth(200);
		tulos = new TextField();
		
		VBox tekstit = new VBox();
		tekstit.getChildren().addAll(new Label("Määrä"),maara,muunna,new Label ("Tulos"), tulos);
		 GridPane.setConstraints(tekstit,2,0);
		 root.getChildren().add(tekstit);
		 
		 
		 muunna.setOnAction(new EventHandler<ActionEvent>() {
			 
			 @Override
			 public void handle(ActionEvent event) {
			 ohjain.muunnos();
			 }
			 
		 });
		 
		 primaryStage.setScene(scene);
		 primaryStage.show();
			}
	
	@Override
	public int getLähtöIndeksi() {
		return valuuttayks.getSelectionModel().getSelectedIndex();
	}

	@Override
	public int getKohdeIndeksi() {
		
		return valuuttakaks.getSelectionModel().getSelectedIndex();
	}

	@Override
	public double getMäärä() {
		double paluuarvo = 0;
		try{
			paluuarvo = Double.parseDouble(maara.getText());
		} catch(Exception e) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Ei ole numero");
			alert.setHeaderText(null);
			alert.setContentText("Syötä vain numeroita");
			alert.initOwner(primaryStage);		
		}
		return paluuarvo;
	}

	@Override
	public void setTulos(double maara) {
		tulos.setText(String.valueOf(maara));
	}


public static void main(String[] args) {
	launch(args);
	
}


}
