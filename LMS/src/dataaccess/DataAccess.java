package dataaccess;

import java.util.HashMap;
import java.util.List;

import business.*;


public interface  DataAccess {
	    public Member searchMember(String memberId);
		public Book searchBook(String isbn);
		
		
		public void saveMember(Member member);
		public void updateMember(Member member);
		public void saveBook(Book book);
		
		public HashMap<String,Book> readBooksMap();
		public HashMap<String,User> readUserMap();
		public boolean memberExists(String MemebrID);
		public void updateBook(Book book);
		public HashMap<String, Member> readMemberMap();
		public HashMap<String, CheckoutRecord> memberRecord();
		public List<Member> getMembers();
}
