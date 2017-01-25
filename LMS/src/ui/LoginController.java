package ui;
import javax.swing.JOptionPane;

import business.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginController {
	    @FXML private Text actiontarget;
	    @FXML private TextField uname;
	    @FXML private PasswordField password;
	    @FXML private Button signin;
	    
	    @FXML protected void loginAction(ActionEvent event) throws Exception {
	    	
	    	if(uname.getText().equals("") || password.getText().equals(""))
	    		actiontarget.setText("Please fill all fields!");
	    	else{
	    		String auth = User.authorize(uname.getText(), password.getText());
	    		if(auth.equals("admin")){
	    			Login adminpage = new Login();
	    			adminpage.start(new Stage());
	    			Stage stage = (Stage) signin.getScene().getWindow();
	    			stage.close();
	    		}
	    		else if(auth.equals("lib")){
	    			Librarian libpage = new Librarian();
	    			libpage.start(new Stage());
	    			Stage stage = (Stage) signin.getScene().getWindow();
	    			stage.close();
	    		}
	    		else{
	    			JOptionPane.showMessageDialog(null, "Incorrect User Name and Password", "Login", JOptionPane.INFORMATION_MESSAGE);
	    			actiontarget.setText("");
	    		}
	    	}
	    }
	    
}
