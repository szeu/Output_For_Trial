package output;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RequestWindowController {

    @FXML
    private Button energyViewButton;

    @FXML
    private TextField requestTextField;

    @FXML
    private Button submitButton;

    @FXML
    void onEnergyVewButtonPressed(ActionEvent event) {
    	createChartWindow();
    }

    @FXML
    void onSubmitButtonPressed(ActionEvent event) {
    	if(verifyInput(requestTextField.getText().trim())) {
    		// TODO - search for team info
    		createTeamTableWindow();
    	}
    	else if(requestTextField.getText().trim().length() > 0) {
    		Alert alert = new Alert(Alert.AlertType.ERROR);
    		alert.setTitle("Invalid Input");
    		alert.setContentText("Incorrect student name or ID. Please try again.");
    		alert.showAndWait();
    	}
    }
    
    boolean verifyInput(String input) {
    	for(Student student : OutputUIApplication.students) {
    		if(student.getName().replaceAll(",", "").toLowerCase().equals(input.toLowerCase())
    				|| student.getID().toLowerCase().equals(input.toLowerCase()))
    			return true;
    	}
    	return false;
    }
    
    void createChartWindow() {
    	try {
	    	FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/lineChartUI.fxml"));
			Stage stage = new Stage();
			VBox root = (VBox) loader.load();
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.setTitle("Student Key Energies Zoom Out View");
			stage.show();
    	}
    	catch (IOException e) {
    		e.printStackTrace();
    	}
    }
    
    void createTeamTableWindow() {
    	try {
	    	FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/displayUI.fxml"));
			Stage stage = new Stage();
			VBox root = (VBox) loader.load();
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.setTitle("Search Result");
			stage.show();
    	}
    	catch (IOException e) {
    		e.printStackTrace();
    	}
    }

}

