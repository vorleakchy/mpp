package lab6.prob1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AddressForm extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Address Form");
	
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));

		Label nameLabel = new Label("Name");
		grid.add(nameLabel, 0, 0);
		TextField nameTextField = new TextField();
		grid.add(nameTextField, 0, 1);
		
		Label streetLabel = new Label("Street");
		grid.add(streetLabel, 1, 0);
		TextField streetTextField = new TextField();
		grid.add(streetTextField, 1, 1);
		
		Label cityLabel = new Label("City");
		grid.add(cityLabel, 2, 0);
		TextField cityTextField = new TextField();
		grid.add(cityTextField, 2, 1);
		
		Label stateLabel = new Label("State");
		grid.add(stateLabel, 0, 2);
		TextField stateTextField = new TextField();
		grid.add(stateTextField, 0, 3);
		
		Label zipLabel = new Label("Zip");
		grid.add(zipLabel, 1, 2);
		TextField zipTextField = new TextField();
		grid.add(zipTextField, 1, 3);
				
		Button submitBtn = new Button("Submit");
		HBox hbBtn = new HBox(10);
		hbBtn.setAlignment(Pos.BASELINE_CENTER);
		hbBtn.getChildren().add(submitBtn);
		grid.add(hbBtn, 1, 4);
		
		
		submitBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println(nameTextField.getText());
				System.out.println(streetTextField.getText());
				System.out.println(cityTextField.getText() + ", " + stateTextField.getText() + " " + zipTextField.getText());
			}
		});
		
		Scene scene = new Scene(grid);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
