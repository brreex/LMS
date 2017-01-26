package ui;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import business.Address;
import business.Author;
import business.Book;
import business.Member;
import business.PublicationCopy;
import dataaccess.DataAccessFacade;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AdministratorController {

	private ObservableList<MemberDisplay> memlist = FXCollections.observableArrayList();

	@FXML
	private Label txtResultInfo;
	@FXML
	private TableView<MemberDisplay> tableMemberSearch;
	@FXML
	private TableColumn<MemberDisplay, String> fName;
	@FXML
	private TableColumn<MemberDisplay, String> lName;
	@FXML
	private TableColumn<Member, String> pno;
	@FXML
	private TableColumn<Member, String> street;
	@FXML
	private TableColumn<Member, String> state;
	@FXML
	private TableColumn<Member, String> city;
	@FXML
	private TableColumn<Member, String> zip;

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
	private TextField txtSearchMemberID;

	@FXML
	private TextField txtTitle;
	@FXML
	private TextField txtISBN;
	@FXML
	private TextField txtMaxDays;
	@FXML
	private TextField txtCopyNo;

	@FXML
	TextField txtAuthFname;
	@FXML
	TextField txtAuthLName;
	@FXML
	TextField txtAuthPNo;
	@FXML
	TextField txtAuthEmail;
	@FXML
	TextArea txtAuthCred;
	@FXML
	TextArea txtAuthBio;
	@FXML

	TextField txtAuthSt;
	@FXML
	TextField txtAuthCity;
	@FXML
	TextField txtAuthState;
	@FXML
	TextField txtAuthZip;

	List<Author> authList = new ArrayList<>();
	Book book;

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
			Address add = new Address(street, city, state, zip, phoneno, email);
			Member mem = new Member(memberID, firstName, lastName, add);
			mem.addMember(mem);
			JOptionPane.showMessageDialog(null, "Member Added".toString(), "Add Member",
					JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage().toString(), "Add Member",
					JOptionPane.INFORMATION_MESSAGE);
		}

	}
	@FXML
	protected void addBook(ActionEvent event) {
		String ISBN = txtISBN.getText();
		String title = txtTitle.getText();
		int maxCheck = Integer.parseInt(txtMaxDays.getText());
		int copyNum = Integer.parseInt(txtCopyNo.getText());

		try {
			PublicationCopy pubCopy = new PublicationCopy(book, (int) Math.random(), true);
			book = new Book(title, ISBN, copyNum, pubCopy,maxCheck, authList, 1);
			book.addBook(book);
			JOptionPane.showMessageDialog(null, "Book Added", "Add Book", JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage().toString(), "Add Book", JOptionPane.INFORMATION_MESSAGE);
			
		}
	}
	@FXML
	public void addAuthor() {

		String firstname = txtAuthFname.getText();
		String lastname = txtAuthLName.getText();
		String phoneno = txtAuthPNo.getText();
		String street = txtAuthSt.getText();
		String city = txtAuthCity.getText();
		String state = txtAuthState.getText();
		int zip = Integer.parseInt(txtAuthZip.getText());
		String credential = txtAuthCred.getText();
		String email = txtAuthEmail.getText();
		boolean bio = Boolean.parseBoolean(txtAuthBio.getText());
		
		Address adr = new Address(street, city, state, zip, phoneno, email);
		Author auth = new Author(firstname, lastname, phoneno, bio, credential, book, adr);
		
		authList.add(auth);
	}

	@FXML
	protected void searchMember(ActionEvent event) {

		String memberId = txtSearchMemberID.getText();
		DataAccessFacade dataaccess = new DataAccessFacade();
		Member mem = dataaccess.searchMember(memberId);
		if (mem != null) {
			TableColumn<MemberDisplay, String> colfname = new TableColumn<>("First Name");
			colfname.setCellValueFactory(new PropertyValueFactory<MemberDisplay, String>("fname"));
			tableMemberSearch.getColumns().add(colfname);

			TableColumn<MemberDisplay, String> collname = new TableColumn<>("Last Name");
			collname.setCellValueFactory(new PropertyValueFactory<MemberDisplay, String>("lname"));
			tableMemberSearch.getColumns().add(collname);

			String f = mem.getFname();
			String l = mem.getLname();

			memlist.add(new MemberDisplay(f, l));

			tableMemberSearch.setItems(memlist);
			tableMemberSearch.getItems().setAll(memlist);
			tableMemberSearch.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
			tableMemberSearch.setVisible(true);
		} else
			txtResultInfo.setText("No Result Found");

	}
}
