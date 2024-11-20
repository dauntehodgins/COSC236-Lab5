package lab5.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import lab5.Ebook;


public class EBookTest {
	
	@Test
	void testBookType() {
		Ebook ebook=new Ebook("harry potter");
		
		assertEquals(ebook.getClass().getName(),"lab5.Ebook" );
		
		assertTrue(ebook instanceof lab5.Book);
		
		
	}


}
