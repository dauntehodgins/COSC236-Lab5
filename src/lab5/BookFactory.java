package lab5;

public abstract class BookFactory {
	public abstract Book createBook(String title);
	private Library lib;
	
	public BookFactory(Library lib) {
		this.lib = lib;
	}

}
