package controllers;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.animation.FadeTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class HomePageController implements Initializable {
	
	@FXML
    private AnchorPane anchor;

    @FXML
    private AnchorPane holderPane;

    @FXML
    private Text welcome; 

    @FXML
    private JFXButton homeBtn;
	
	@FXML
	AnchorPane home;

    @FXML
    private JFXButton logout;

    @FXML
    private JFXButton exit;
	
	
	private static HomePageController instance;
	
	
	public HomePageController()
	{
		instance = this;
	}
	
	public static HomePageController getInstance()
	{
		return instance;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		createPage(home,"/fxml/Home.fxml");
	}

	private void setNode(Node node) {
		holderPane.getChildren().clear();
		holderPane.getChildren().add((Node)node);
		
		FadeTransition ft = new FadeTransition(Duration.millis(2500));
        ft.setNode(node);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
	}

	public void createPage(AnchorPane homeN,String loc) {
		
		try {
			homeN = FXMLLoader.load(getClass().getResource(loc));
			setNode(homeN);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	 @FXML
		public void exit(ActionEvent Exit) {

			 Platform.exit();
			 
		    }
	    @FXML
		public void logOut(ActionEvent LoggingOut) {
	    
	    	logout.getScene().getWindow().hide();
	   	   
			try {
				
		   	Stage login = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/fxml/LogInMain.fxml"));
	        Scene scene = new Scene(root);
	        login.setScene(scene);
	        login.show();
	        login.setResizable(false);
	        login.setTitle("Tourisy");

			} catch (IOException e) {	
				
			e.printStackTrace();
			}
	    	
		  }
	
	@FXML
	public void homeBtn(ActionEvent ReturnToHome)
	{
		HomePageController.getInstance().createPage(home, "/fxml/Home.fxml");
	}

}
