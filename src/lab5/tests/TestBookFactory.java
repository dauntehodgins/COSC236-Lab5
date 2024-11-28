package lab5.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import lab5.AudioBookFactory;
import lab5.Book;
import lab5.BookFactory;
import lab5.EBookFactory;
import lab5.Library;
import lab5.PaperBookFactory;
import lab5.RareBookFactory;

public class TestBookFactory {
	
	Library lib = new Library();
	
	PaperBookFactory pfactory = new PaperBookFactory(lib);
	
	EBookFactory efactory = new EBookFactory(lib);
	
	AudioBookFactory afactory = new AudioBookFactory(lib);
	
	RareBookFactory rfactory = new RareBookFactory(lib);
	
	@Test
	public void TestBookFactory() {
	
	Book book1 = pfactory.createBook("moby dick");
	
	Book book2 = efactory.createBook("the outsiders");
	
	Book book3 = afactory.createBook("harry potter");
	
	Book book4 = rfactory.createBook("romeo and juliet");
	
	Book book5 = pfactory.createBook("HistoricBook: dantes inferno");
	
	assertEquals(book1.toString(), "PaperBook: moby dick");
	
	assertEquals(book2.toString(),"EBook: the outsiders" );
	
	assertEquals(book3.toString(),"AudioBook: harry potter");
	
	assertEquals(book4.toString(),"RareBook: romeo and juliet" );
	
	assertFalse(book5.toString().equals("HistoricBook: dantes inferno"));
	
	}
	
}
