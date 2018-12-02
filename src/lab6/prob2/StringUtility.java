package lab6.prob2;

import java.util.LinkedHashSet;
import java.util.Set;
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
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StringUtility extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("String Utility");
	
		GridPane grid = new GridPane();
		
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));

		Button countLettersBtn = new Button("Count Letters");
		Button reverseLettersBtn = new Button("Reverse Letters");
		Button removeDuplicatesBtn = new Button("Remove Duplicates");
		countLettersBtn.setMinWidth(140);
		reverseLettersBtn.setMinWidth(140);
		removeDuplicatesBtn.setMinWidth(140);
		countLettersBtn.setAlignment(Pos.BASELINE_LEFT);
		reverseLettersBtn.setAlignment(Pos.BASELINE_LEFT);
		removeDuplicatesBtn.setAlignment(Pos.BASELINE_LEFT);
		
		VBox vbox1 = new VBox(10);
		vbox1.getChildren().add(countLettersBtn);
		vbox1.getChildren().add(reverseLettersBtn);
		vbox1.getChildren().add(removeDuplicatesBtn);
		grid.addColumn(0, vbox1);

		Label inputLabel = new Label("Input");
		TextField inputTextField = new TextField();
		Label outputLabel = new Label("Output");
		TextField outputTextField = new TextField();
		
		VBox vbox2 = new VBox();
		vbox2.getChildren().add(0, inputLabel);
		vbox2.getChildren().add(1, inputTextField);
		vbox2.getChildren().add(2, outputLabel);
		vbox2.getChildren().add(3, outputTextField);
		grid.addColumn(1, vbox2);
		
		Scene scene = new Scene(grid);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		countLettersBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				String output = String.valueOf(count(inputTextField.getText()));
				
				outputTextField.setText(output);
			}
		});
		
		reverseLettersBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				String output = reverse(inputTextField.getText());
				
				outputTextField.setText(output);
			}			
		});
		
		removeDuplicatesBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				String output = removeDuplicates(inputTextField.getText());
				
				outputTextField.setText(output);
			}
		});
	}
	
	private int count(String string) {
		return string.length();
	}
	
	private String reverse(String string) {
		StringBuilder input = new StringBuilder(string);
		
		return input.reverse().toString();
	}
	
	private String removeDuplicates(String string) {
		char[] chars = string.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		
		for (char c : chars) {
		    charSet.add(c);
		}
		
		StringBuilder output = new StringBuilder();
		for (Character character : charSet) {
		    output.append(character);
		}

		return output.toString();
	}
}
