package lab5;

public class EBookFactory extends BookFactory {

	public EBookFactory(Library lib) {
		super(lib);
	}

	@Override
	public
	Book createBook(String title) {
		return new Ebook(title);
	}

}
