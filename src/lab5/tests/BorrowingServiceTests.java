package lab5.tests;


import static org.junit.Assert.assertTrue;

import org.junit.Test;

import lab5.Book;
import lab5.Member;
import lab5.PaperBook;
import lab5.RareBook;



public class BorrowingServiceTests {
		
	@Test
	public void testBorrowing(){
		Member member1 = new Member("Dude");
		Member member2 = new Member("Gal");
		Book book1 = new PaperBook("Dune");
		Book book2 = new PaperBook("1984");
		Book book3 = new RareBook("Harry Potter");
		Book book4 = new RareBook("Java for dummies");
		System.out.println("TESTING THINGS");
		assertTrue(member1.borrowBook(book1));
	}
}
