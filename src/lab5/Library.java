package lab5;

import java.util.ArrayList;
import java.util.Iterator;


public class Library {
	 
	private ArrayList<Book> catalog = new ArrayList<>(); // Book dependency
	private ArrayList<Member> members = new ArrayList<>(); // Member dependency
	
	public Member findMemberByName(String name) {
		 for (Member member : members) {
	           if (member.getName().equals(name)) {
	               return member; // Return the found member
	           }
	       }
	       return null; // Return null if not found
	}
	public Book findBookByTitle (String title) {
		 for (Book book : catalog) {
	           if (book.getTitle().equals(title)) {
	               return book; // Return the found book
	           }
	       }
	       return null; // Return null if not found
	}
	public void addMember(Member member) {
		members.add(member);
	}
	public void addBook(Book paperBook) {
		catalog.add(paperBook);
	}
	public void removeMember(String name) {
		Member member = findMemberByName(name);
		removeMember(member);
	}
	public void removeMember(Member member) {
		if(member != null) {
			member.returnAllBooks(); // return all member's books to the library
			members.remove(member);
		}
	}
	public void removeBook(String title) {
		Book paperBook = findBookByTitle(title);
		removeBook(paperBook);
	}
	public void removeBook(Book paperBook) {
		if (paperBook != null)
			catalog.remove(paperBook); // book stays with the member who has it
	}
	public void showMembers() {
		Iterator<Member> memberIterator = members.iterator();
	    while(memberIterator.hasNext()) {
		   	 Member member = memberIterator.next();
		   	 System.out.println(member);
	    }
	}
	public void showBooks() {
		Iterator<Book> bookIterator = catalog.iterator();
	    while(bookIterator.hasNext()) {
		   	 Book paperBook = bookIterator.next();
		   	 System.out.println(paperBook); // book.toString()
	    }
	}
	public int booksCount() {
		return catalog.size();
	}
	public int membersCount() {
		return members.size();
	}
}
