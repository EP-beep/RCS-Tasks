package controllers;



import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.validation.RequiredFieldValidator;
import com.jfoenix.validation.base.ValidatorBase;

import javafx.animation.PauseTransition;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import databaseconnection.DBHandler;

public class SignUpController implements Initializable {
   		@FXML
   		private AnchorPane parentPane;
	
	 	@FXML
	    private JFXTextField email;

	    @FXML
	    private JFXPasswordField password;

	    @FXML
	    private JFXRadioButton male;

	    @FXML
	    private ToggleGroup gender;

	    @FXML
	    private JFXRadioButton female;

	    @FXML
	    private JFXButton signup;

	    @FXML
	    private JFXButton login;

	    @FXML
	    private ImageView progress;

	    @FXML
	    private JFXRadioButton other;
	    
	    private Connection connection;
	    
	    private DBHandler handler;
	    
	    private PreparedStatement statement;
	    
	    @FXML
	    private ImageView registrationarrow;

	    @FXML
	    private Label registrationdonee;

	    @FXML
	    private Label registrationdone;
	    

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		 signup.setDisable(true);
		 progress.setVisible(false);
		 registrationarrow.setVisible(false);
		 registrationdonee.setVisible(false);
		 registrationdone.setVisible(false);
		 email.setStyle("-fx-text-inner-color: #B4D330");
		 password.setStyle("-fx-text-inner-color: #B4D330");
		 handler = new DBHandler();
			
         RequiredFieldValidator requiredFieldValidator = new RequiredFieldValidator();
         requiredFieldValidator.setMessage("Empty Field!");
         ValidatorBase emailValidator = new ValidatorBase() {
            
             protected void eval() {
                 setMessage("Email is not correct!");
                 if (email.getText().length() < 2 || !isValidEmailAddress(email.getText())) {
                     hasErrors.set(true);
                 } else 
                	 hasErrors.set(false);
                 	 
             }
         };
         email.getValidators().addAll(requiredFieldValidator, emailValidator);

         email.focusedProperty().addListener((ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) -> {
             if (!newValue) {
                 email.validate();
             }
         });
         
         ValidatorBase lenghtPassword = new ValidatorBase() {
             @Override
             protected void eval() {
                 JFXPasswordField pass = (JFXPasswordField) getSrcControl();
                 setMessage("Set password with at least 6 characters");
                 if (pass.getText().length() < 6) {
                     hasErrors.set(true);
                 } else 
                	 hasErrors.set(false);
             }
         };
         password.getValidators().addAll(requiredFieldValidator, lenghtPassword);
         password.focusedProperty().addListener((ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) -> {
             if (!newValue) {
            	 if(password.validate() && email.validate()) signup.setDisable(false)  ;
                 else signup.setDisable(true);
             }
         });
	}
	@FXML
	public void  SignUp(ActionEvent Signingup ) {
		 progress.setVisible(true);
		 PauseTransition pt = new PauseTransition();
		 pt.setDuration(Duration.seconds(3));
	        pt.setOnFinished(ev -> {
	        	 registrationarrow.setVisible(true);
	    		 registrationdonee.setVisible(true);
	    		 registrationdone.setVisible(true);
	            System.out.println("Registered Sucessfully ....");
	   		 progress.setVisible(false);

	        });
	        pt.play();
	        
			String insert = "INSERT INTO tourisyusers(emails,passwords,genders)" 
					+ "VALUES (?,?,?)";
					
			connection = handler.getConnection();
			try {
				statement = connection.prepareStatement(insert);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
			try {
				statement.setString(1, email.getText());
				statement.setString(2, password.getText());
				statement.setString(3, getGender());			
				
				statement.executeUpdate();

			} catch (SQLException e1) {
			
				e1.printStackTrace();
			}
	}
	
	@FXML
	public void loginAction(ActionEvent LoggingIn) throws IOException {
		signup.getScene().getWindow().hide();
   	 	progress.setVisible(false);
   	
   	 	Stage login = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/fxml/LogInMain.fxml"));
        Scene scene = new Scene(root);
        login.setScene(scene);
        login.show();
        login.setResizable(false);
	}
	public String getGender() {
		String gen = "";
		
		if (male.isSelected()) {
			gen  = "Male";
		}else if(female.isSelected()) {
			gen = "Female";
		}else
			gen = "Other";
		
		return gen;
	}
	public static boolean isValidEmailAddress(String emailAddress) {
	    String emailRegEx;
	    Pattern pattern;
	    emailRegEx = "^[A-Za-z0-9._%+\\-]+@[A-Za-z0-9.\\-]+\\.[A-Za-z]{2,4}$";
	    pattern = Pattern.compile(emailRegEx);
	    Matcher matcher = pattern.matcher(emailAddress);
	    if (!matcher.find()) {
	      return false;
	    }
	    return true;
	  }
}
