package controllers;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import com.jfoenix.controls.*;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;
import databaseconnection.DBHandler;


public class LogInController implements Initializable {
	

    @FXML
    private CheckBox remember;

    @FXML
    private ImageView progress;

    @FXML
    private JFXButton signup;

    @FXML
    private JFXButton login;

    @FXML
    private JFXPasswordField password;

    @FXML
    private JFXTextField email;

    @FXML
    private JFXButton forgotpassword;
    
    private DBHandler handler;
    private Connection connection;
    private PreparedStatement statement;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		 progress.setVisible(false);
		 email.setStyle("-fx-text-inner-color: #B4D330");
		 password.setStyle("-fx-text-inner-color: #B4D330");
		 handler = new DBHandler();	 
	}
	@FXML
	public void loginAction(ActionEvent e) {
		progress.setVisible(true);
		PauseTransition pt = new PauseTransition();
		pt.setDuration(Duration.seconds(3));
        pt.setOnFinished(ev -> {
            
        });
        pt.play();
        
        //Retrieve Data from Database
        connection = handler.getConnection();
        String q1 = "SELECT * from tourisyusers where emails=? and passwords=?";
        try {
			statement = connection.prepareStatement(q1);
			statement.setString(1, email.getText());
			statement.setString(2, password.getText());
			ResultSet rs = statement.executeQuery();
			int count =0;
			while(rs.next()) {
				count = count+1;
			}
			if (count == 1) {
				
				login.getScene().getWindow().hide();
				Stage home = new Stage();
				try {
					Parent root = FXMLLoader.load(getClass().getResource("/fxml/HomePage.fxml"));
					Scene scene = new Scene(root);
					home.setScene(scene);
					home.show();
					home.setResizable(false);
					home.setTitle("Tourisy");
					
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}else {
				Alert alert = new Alert(Alert.AlertType.ERROR);
				alert.setHeaderText(null);
				alert.setContentText("Username or Password is Incorrect!");
				alert.show();
				progress.setVisible(false);
			}
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
        finally {
			try {
				connection.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} 
	}
    @FXML
    public void signUp(ActionEvent ev) {
        try {

            login.getScene().getWindow().hide();
            Stage signup = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/SignUp.fxml"));
            Scene scene = new Scene(root);
            signup.setScene(scene);
            signup.show();
            signup.setResizable(false);
            signup.setTitle("Tourisy");

        } catch (Exception e) {
            System.out.println(" Error Signing up : " + e);
        }
    }

}
