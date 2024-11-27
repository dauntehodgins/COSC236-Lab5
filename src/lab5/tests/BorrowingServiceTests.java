package lab5.tests;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import lab5.AudioBook;
import lab5.Book;
import lab5.BorrowingBookResult;
import lab5.BorrowingService;
import lab5.Ebook;
import lab5.Member;
import lab5.PaperBook;
import lab5.RareBook;



public class BorrowingServiceTests {
		
	@Test
	public void testBorrowing(){
		
		
		Member member1 = new Member("Dude",BorrowingService.getInstance());
		Member member2 = new Member("Gal",BorrowingService.getInstance());
		Book book1 = new PaperBook("Dune");
		Book book2 = new AudioBook("1984");
		Book book3 = new Ebook("Harry Potter");
		Book book4 = new RareBook("Java for dummies");
		
		
		
		BorrowingService.getInstance().borrowBook(member1, book1);
		
		BorrowingService.getInstance().borrowBook(member1, book2);
		
		BorrowingService.getInstance().borrowBook(member1, book3);
		
		assertEquals(BorrowingService.getInstance().borrowBook(member1, book1).getBorrowingMessage(),"Book already borrowed.");
		
		System.out.println(member1.getBorrowedBooks());
		
assertEquals(BorrowingService.getInstance().borrowBook(member1, book4).getBorrowingMessage(),"Dude has already borrowed 3 books.");
		
assertEquals(BorrowingService.getInstance().borrowBook(member2,book4).getBorrowingMessage(),"Book borrowed.");
		
	}
}
