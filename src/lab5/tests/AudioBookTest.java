package lab5.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import lab5.AudioBook;

public class AudioBookTest {
	
	@Test
	void testBookType() {
		AudioBook audiobook=new AudioBook("harry potter");
		
		assertEquals(audiobook.getClass().getName(),"lab5.AudioBook" );
		
		assertTrue(audiobook instanceof lab5.Book);
	}

}
