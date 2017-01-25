package ui;
import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
public class LoginController {
	    @FXML private Text actiontarget;
	    @FXML private String usernameText;
	    
	    @FXML protected void loginAction(ActionEvent event) {
	    	JOptionPane.showMessageDialog(null, "Login","Login", JOptionPane.INFORMATION_MESSAGE);
	    }
	    
}
