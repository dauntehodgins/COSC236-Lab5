package lab5;

public class AudioBookFactory extends BookFactory{
	
	public AudioBookFactory(Library lib) {
		super(lib);
	}

	@Override
	public
	Book createBook(String title) {
		return new AudioBook(title);
	}

}
