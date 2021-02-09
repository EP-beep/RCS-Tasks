package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;

public class ComboBoxController implements Initializable{
	
	@FXML
	private AnchorPane afghinfo;
	@FXML
	private AnchorPane albinfo;
    @FXML
    private AnchorPane alginfo;
    @FXML
    private AnchorPane andorinfo;
    @FXML
    private AnchorPane angolinfo;
    @FXML
    private AnchorPane antignbarinfo;
    @FXML
    private AnchorPane argentiinfo;
    @FXML
    private AnchorPane armeninfo;
    @FXML
    private AnchorPane aussieinfo;
    @FXML
    private AnchorPane austriainfo;
	
	
	
	@FXML
    private ComboBox<String> comboBox;
	
	
	ObservableList<String> list = FXCollections.observableArrayList(
	"Afghanistan", "Albania", "Algeria", "Andorra", "Angola",
	"Antigua and Barbuda", "Argentina", "Armenia","Australia",
	"Austria"
	);

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		comboBox.setItems(list);
	}
	public void comboChanged(ActionEvent event) {
		if (comboBox.getValue().equals("Afghanistan")) {
			HomePageController.getInstance().createPage(afghinfo, "/countries/Afghanistan.fxml");
		}else if (comboBox.getValue().equals("Albania")) {
			HomePageController.getInstance().createPage(albinfo, "/countries/Albania.fxml");
		}else if (comboBox.getValue().equals("Algeria")) {
			HomePageController.getInstance().createPage(alginfo, "/countries/Algeria.fxml");
		}else if (comboBox.getValue().equals("Andorra")) {
			HomePageController.getInstance().createPage(andorinfo, "/countries/Andorra.fxml");
		}else if (comboBox.getValue().equals("Angola")) {
			HomePageController.getInstance().createPage(angolinfo, "/countries/Angola.fxml");
		}else if (comboBox.getValue().equals("Antigua and Barbuda")) {
			HomePageController.getInstance().createPage(antignbarinfo, "/countries/AntiguanBabuda.fxml");
		}else if (comboBox.getValue().equals("Argentina")) {
			HomePageController.getInstance().createPage(argentiinfo, "/countries/Argentina.fxml");
		}else if (comboBox.getValue().equals("Armenia")) {
			HomePageController.getInstance().createPage(argentiinfo, "/countries/Armenia.fxml");
		}else if (comboBox.getValue().equals("Australia")) {
			HomePageController.getInstance().createPage(aussieinfo, "/countries/Australia.fxml");
		}else if (comboBox.getValue().equals("Austria")) {
			HomePageController.getInstance().createPage(austriainfo, "/countries/Austria.fxml");
		}
	}
	

}
