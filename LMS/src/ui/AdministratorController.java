package ui;
import javax.swing.JOptionPane;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class AdministratorController {
	@FXML
	private Text actiontarget;
	@FXML
	private TextField usernameText;
	@FXML
	private TextField txtFirstName;
	@FXML
	private TextField txtPhoneNo;
	@FXML
	private TextField txtMemberId;
	@FXML
	private TextField txtStreet;
	@FXML
	private TextField txtCity;
	@FXML
	private TextField txtZip;
	@FXML
	private TextField txtState;
	@FXML
	private TextField txtLName;
	@FXML
	private Button btnSubmit;
	
	@FXML
	protected void addAuthor(ActionEvent event) {
		JOptionPane.showMessageDialog(null, "Save Member","Add Author", JOptionPane.INFORMATION_MESSAGE);
	}
	
	@FXML
	protected void addBook(ActionEvent event) {
		JOptionPane.showMessageDialog(null, "Save Member","Add Book", JOptionPane.INFORMATION_MESSAGE);
	}
}
