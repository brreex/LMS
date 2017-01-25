package dataaccess;

import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;

import business.Book;
import business.CheckoutRecord;
import business.Member;
import business.User;

public class DataAccessFacade implements DataAccess {
	enum StorageType {
		BOOKS, MEMBERS, USERS;
	}
	
	public static final String OUTPUT_DIR = System.getProperty("user.dir") + "\\src\\dataaccess\\database";
	public static final String DATE_PATTERN = "MM/dd/yyyy";

	
	
	public boolean memberExists(String MemebrID)
	{
		Member member=searchMember(MemebrID);
		if(member==null)
			return false;
		return true;
	}
	public Member searchMember(String memberId) {
		HashMap<String,Member> MembersMap =  readMemberMap();
		Member member = MembersMap.get(memberId);
		return member;
	}
	
	
	
	public void saveMember(Member Member) {
		HashMap<String, Member> MemberMap = readMemberMap();
		if(MemberMap == null)
			MemberMap = new HashMap<String,Member>();
		
		MemberMap.put(Member.getMemberID(), Member);
		saveToStorage(StorageType.MEMBERS, MemberMap);	
	}
	
	@SuppressWarnings("unchecked")
	public  HashMap<String,Member> readMemberMap() {	
		return (HashMap<String, Member>) readFromStorage(StorageType.MEMBERS);
	}
	
	@Override
	public void saveBook(Book book) {
		HashMap<String, Book> bookMap = readBooksMap();
		String isbn = book.getISBN();
		bookMap.put(isbn, book);
		saveToStorage(StorageType.BOOKS, bookMap);	
	}
	
	public Book searchBook(String isbn) {
		HashMap<String,Book> booksMap =  readBooksMap();
		Book book = booksMap.get(isbn);
		return book;
	}
	
	public void updateBook(Book book) {
		HashMap<String, Book> bookMap = readBooksMap();
		String isbn = book.getISBN();
		bookMap.put(isbn, book);
		saveToStorage(StorageType.BOOKS, bookMap);	
	}
	
	@SuppressWarnings("unchecked")
	public  HashMap<String,Book> readBooksMap() {	
		return (HashMap<String,Book>) readFromStorage(StorageType.BOOKS);
	}
	
	@SuppressWarnings("unchecked")
	public HashMap<String, User> readUserMap() {
		return (HashMap<String, User>)readFromStorage(StorageType.USERS);
	}
	
	static void loadBookMap(List<Book> bookList) {
		HashMap<String, Book> map = new HashMap<String, Book>();
		bookList.forEach(book -> map.put(book.getISBN(), book));
		saveToStorage(StorageType.BOOKS, map);
	}
	
	static void saveToStorage(StorageType type, Object ob) {
		ObjectOutputStream out = null;
		try {
			Path path = FileSystems.getDefault().getPath(OUTPUT_DIR, type.toString());
			out = new ObjectOutputStream(Files.newOutputStream(path));
			out.writeObject(ob);
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			if(out != null) {
				try {
					out.close();
				} catch(Exception e) {}
			}
		}
	}
	
	static Object readFromStorage(StorageType type) {
		ObjectInputStream in = null;
		Object retVal = null;
		try {
			Path path = FileSystems.getDefault().getPath(OUTPUT_DIR, type.toString());
			in = new ObjectInputStream(Files.newInputStream(path));
			retVal = in.readObject();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(in != null) {
				try {
					in.close();
					
				} catch(Exception e) {}
			}
		}
		return retVal;
	}

		

	@Override
	public void updateMember(Member member) {
		
		
	}
	@Override
	public HashMap<String, CheckoutRecord> memberRecord() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Member> getMembers() {
		// TODO Auto-generated method stub
		return null;
	}

}
