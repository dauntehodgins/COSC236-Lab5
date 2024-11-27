package lab5;

public class RareBookFactory extends BookFactory{
	
	public RareBookFactory(Library lib) {
		super(lib);
	}

	@Override
	public Book createBook(String title) {
		return new RareBook(title);
	}

}

