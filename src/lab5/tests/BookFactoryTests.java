package lab5.tests;

import lab5.Library;
import lab5.Book;
import lab5.BookFactory;
import lab5.PaperBook;
import lab5.PaperBookFactory;
import lab5.AudioBook;
import lab5.AudioBookFactory;
import lab5.RareBook;
import lab5.RareBookFactory;
import lab5.EBookFactory;
import lab5.Ebook;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class BookFactoryTests {
	@Test
	public void testFactory() {
		Library lib = new Library();
		//Paper
		BookFactory paperBookFactory = new PaperBookFactory(lib);
		Book paper = paperBookFactory.createBook("Dune");
		//Audio
		BookFactory audioBookFactory = new AudioBookFactory(lib);
		Book audio = audioBookFactory.createBook("Java For Dummies");
		//Rare
		BookFactory rareBookFactory = new RareBookFactory(lib);
		Book rare = rareBookFactory.createBook("Odyssey");
		//EBook
		BookFactory eBookFactory = new EBookFactory(lib);
		Book eBook = eBookFactory.createBook("Design Patterns");
		
		assertTrue(paper instanceof PaperBook);
		assertTrue(audio instanceof AudioBook);
		assertTrue(rare instanceof RareBook);
		assertTrue(eBook instanceof Ebook);
	}
}
