package lab5;

import java.util.ArrayList;
import java.util.Iterator;

public class Member {

	private String name;
	private ArrayList<Book> borrowedBooks; // Book class dependency
	
	public Member(String name) {
		this.name = name;
		this.borrowedBooks = new ArrayList<>();
	}
	public String getName() {
		return name;
	}
	public ArrayList<Book> getBorrowedBooks() { 
		return borrowedBooks;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "Member: " + name;
	}
//	public void borrowBook(Book paperBook) {
//		if (paperBook != null && paperBook.getIsAvailable() == true) {
//			borrowedBooks.add(paperBook);
//			paperBook.setIsAvailable(false);
//		}
//	}
	public boolean borrowBook(Book book) {
		BorrowingService borrowingService = new BorrowingService();
		BorrowingBookResult result = borrowingService.borrowBook(this, book);
		System.out.println(result.getBorrowingMessage());
		return result.isSuccess();
	}
	
//	public void returnBook(Book paperBook) {
//		if (paperBook != null) {
//			borrowedBooks.remove(paperBook);
//			paperBook.setIsAvailable(true);
//		}
//	}
	public boolean returnBook(Book book) {
		BorrowingService borrowingService = new BorrowingService();
		BorrowingBookResult result = borrowingService.returnBook(this, book);
		System.out.println(result.getBorrowingMessage());
		return result.isSuccess();
	}
	
	public void listBorrowedBooks() {
		for (Book paperBook : borrowedBooks)
			System.out.println(paperBook); // book.toString()
	}
	public int borrowedBooksCount() {
		return borrowedBooks.size();
	}
	public void returnAllBooks() {
		Iterator<Book> bookIterator = borrowedBooks.iterator();
	    while(bookIterator.hasNext()) {
		   	 Book paperBook = bookIterator.next();
		   	 paperBook.setIsAvailable(true);
	    }
	    borrowedBooks.clear(); // clear array of borrowed books
	}
}
