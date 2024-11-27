package lab5;

public class PaperBookFactory extends BookFactory {
	
	public PaperBookFactory(Library lib) {
		super(lib);
	}

	@Override
	public Book createBook(String title) {
		return new PaperBook(title);
	}

}
