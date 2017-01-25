package ui;
import javax.swing.JOptionPane;

import business.Address;
import business.Member;
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
	private TextField txtLastName;
	
	@FXML
	private TextField txtPhoneNo;
	
	@FXML
	private TextField txtEmail;
	
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
	private Button btnSubmit;
	
	@FXML
	protected void addLibraryMember(ActionEvent event) {
		String memberID = txtMemberId.getText();
		String firstName = txtFirstName.getText();
		String lastName = txtLastName.getText();
		String phoneno = txtPhoneNo.getText();
		String email = txtEmail.getText();
		String street = txtStreet.getText();
		String state = txtState.getText();
		String city = txtCity.getText();
		int zip = Integer.parseInt(txtZip.getText());
		
		
		try {
			Address add = new Address(street,city,state,zip,phoneno,email);
			Member mem = new Member(memberID,firstName, lastName, add);
			mem.addMember(mem);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage().toString(),"Add Member", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	@FXML
	protected void addAuthor(ActionEvent event) {
		JOptionPane.showMessageDialog(null, "Save Member","Add Author", JOptionPane.INFORMATION_MESSAGE);
	}
	
	@FXML
	protected void addBook(ActionEvent event) {
		JOptionPane.showMessageDialog(null, "Save Member","Add Book", JOptionPane.INFORMATION_MESSAGE);
	}
}
