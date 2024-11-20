package lab5.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import lab5.PaperBook;

public class PaperBookTest {
	
	@Test
	void testBookType() {
		PaperBook paperbook=new PaperBook("harry potter");
		
		assertEquals(paperbook.getClass().getName(),"lab5.PaperBook" );
		
		assertTrue(paperbook instanceof lab5.Book);
	}


}
