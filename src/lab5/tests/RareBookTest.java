package lab5.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import lab5.RareBook;

public class RareBookTest {
	
	@Test
	void testBookType() {
		RareBook rarebook=new RareBook("harry potter");
		
		assertEquals(rarebook.getClass().getName(),"lab5.RareBook" );
		
		assertTrue(rarebook instanceof lab5.Book);
	}

}
