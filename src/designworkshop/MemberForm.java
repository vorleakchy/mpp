package designworkshop;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class MemberForm extends Application {

	private TableView<LibMember> table = new TableView<>();
	
	private ObservableList<LibMember> data = FXCollections.observableArrayList();
	private TextField memberIdTextField = new TextField();
	private TextField firstNameTextField = new TextField();
	private TextField lastNameTextField = new TextField();
	private TextField phoneNumberTextField = new TextField();
	private TextField streetTextField = new TextField();
	private TextField cityTextField = new TextField();
	private TextField stateTextField = new TextField();
	private TextField zipTextField = new TextField();
	
	private Button createBtn = new Button("Create");;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		loadDefaultData();
		
		primaryStage.setTitle("Member Form");
	
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		
		Label memberIdLabel = new Label("Member ID");
		grid.add(memberIdLabel, 0, 0);
		grid.add(memberIdTextField, 1, 0);
		
		Label firstNameLabel = new Label("First Name");
		grid.add(firstNameLabel, 0, 1);
		grid.add(firstNameTextField, 1, 1);

		Label lastNameLabel = new Label("Last Name");
		grid.add(lastNameLabel, 0, 2);
		grid.add(lastNameTextField, 1, 2);
		
		Label phoneNumberLabel = new Label("Phone");
		grid.add(phoneNumberLabel, 0, 3);
		grid.add(phoneNumberTextField, 1, 3);

		Label streetLabel = new Label("Street");
		grid.add(streetLabel, 0, 4);
		grid.add(streetTextField, 1, 4);

		Label cityLabel = new Label("City");
		grid.add(cityLabel, 0, 5);
		grid.add(cityTextField, 1, 5);

		Label stateLabel = new Label("State");
		grid.add(stateLabel, 0, 6);
		grid.add(stateTextField, 1, 6);

		Label zipLabel = new Label("Zip");
		grid.add(zipLabel, 0, 7);
		grid.add(zipTextField, 1, 7);
		
		Button updateBtn = new Button("Update");
		Button clearBtn = new Button("Clear");
		HBox hbBtn = new HBox(10);
		hbBtn.setAlignment(Pos.BASELINE_CENTER);
		hbBtn.getChildren().add(createBtn);
		hbBtn.getChildren().add(updateBtn);
		hbBtn.getChildren().add(clearBtn);
		grid.add(hbBtn, 1, 8);
		
		TableColumn<LibMember, String> memberIdCol = new TableColumn<>("Member ID");
		memberIdCol.setCellValueFactory(new PropertyValueFactory<LibMember, String>("id"));
		
		TableColumn<LibMember, String> firstNameCol = new TableColumn<>("First Name");
		firstNameCol.setCellValueFactory(new PropertyValueFactory<LibMember, String>("firstName"));
		
        TableColumn<LibMember, String> lastNameCol = new TableColumn<>("Last Name");
        lastNameCol.setCellValueFactory(new PropertyValueFactory<LibMember, String>("lastName"));
        
        table.setItems(data);
        table.getColumns().add(memberIdCol);
        table.getColumns().add(firstNameCol);
        table.getColumns().add(lastNameCol);
        
        HBox hbTable = new HBox(10);
        hbTable.getChildren().add(table);
        grid.add(hbTable, 1, 9);
		
		createBtn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {		
				createMember();
			}
		});
		
		updateBtn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				LibMember member = getMemberInfo();
				
				MemberController controller = MemberController.getInstance();
				controller.updateMember(member);
				
				data.clear();
				for (LibMember libMember : controller.getAllMembers()) {
					data.add(libMember);
				}
				
				clearForm();
				showDialog("Member has been updated.");
			}
		});
		
		clearBtn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				clearForm();
			}
		});		
		
		table.setRowFactory(tv -> {
		    TableRow<LibMember> row = new TableRow<>();
		    row.setOnMouseClicked(event -> {
		        if (! row.isEmpty() && event.getButton()==MouseButton.PRIMARY 
		             && event.getClickCount() == 2) {

		            LibMember libMember = row.getItem();
		            
		            MemberController controller = MemberController.getInstance();
					LibMember member = controller.getMemberById(libMember.getId());
		            
					displayMemberInfo(member);
		        }
		    });
		    return row ;
		});
		
		Scene scene = new Scene(grid);
		primaryStage.setScene(scene);
		primaryStage.show();		
	}
	
	private LibMember getMemberInfo() {
		Address address = new Address(
				streetTextField.getText(),
				cityTextField.getText(),
				stateTextField.getText(),
				zipTextField.getText()	
			);
		
		LibMember libMember = new LibMember(
				memberIdTextField.getText(),
				firstNameTextField.getText(),
				lastNameTextField.getText(),
				phoneNumberTextField.getText(),	
				address
			);
		
		return libMember;
	}

	private void createMember() {
		LibMember member = getMemberInfo();
		
		MemberController controller = MemberController.getInstance();
		controller.addNewMember(member);
		data.add(member);				
		
		clearForm();
		showDialog("Member has been created.");
	}
	
	private void displayMemberInfo(LibMember member) {
		createBtn.setDisable(true);
		memberIdTextField.setDisable(true);
        memberIdTextField.setText(member.getId());
        firstNameTextField.setText(member.getFirstName());
        lastNameTextField.setText(member.getLastName());
        phoneNumberTextField.setText(member.getPhoneNumber());
        streetTextField.setText(member.getAddress().getStreet());
        cityTextField.setText(member.getAddress().getCity());
        stateTextField.setText(member.getAddress().getState());
        zipTextField.setText(member.getAddress().getZip());
	}
	
	private void clearForm() {
		createBtn.setDisable(false);
		memberIdTextField.setDisable(false);
		memberIdTextField.clear();
        firstNameTextField.clear();
        lastNameTextField.clear();
        phoneNumberTextField.clear();
        streetTextField.clear();
        cityTextField.clear();
        stateTextField.clear();
        zipTextField.clear();
	}
	
	private void loadDefaultData() {
		MemberController controller = MemberController.getInstance();
		LibMember member1 = new LibMember("001", "Edwin", "Bernal", "18677451787", new Address("1000 North Fourth Street", "Fairfield", "Iowa", "52557"));
		LibMember member2 = new LibMember("002", "Phyo Lin", "Tun", "6587522787", new Address("2000 N Ct St #20-D", "Fairfield", "Iowa", "52556"));
		
		controller.addNewMember(member1);
		controller.addNewMember(member2);

		data.add(member1);
		data.add(member2);
	}
	
	private void showDialog(String msg) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setContentText(msg);

		alert.showAndWait();
	}
}