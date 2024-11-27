package lab5;

public class LibrarianController {

	private Library library; // Library dependency
	private BorrowingService borrowingService;
	EBookFactory eBookFactory;
	AudioBookFactory audioBookFactory;
	RareBookFactory rareBookFactory;
	PaperBookFactory paperBookFactory;
	public LibrarianController( ) {
		this.library = new Library(); // Constructor injection
		this.borrowingService = BorrowingService.getInstance();
		this.eBookFactory = new EBookFactory(library);
		this.audioBookFactory = new AudioBookFactory(library);
		this.rareBookFactory = new RareBookFactory(library);
		this.paperBookFactory = new PaperBookFactory(library);
		
		
		//Creating books with Book Factories
	}
	public Library getLibrary() {
		return this.library;
	}
	public void showBooks() {
		library.showBooks();
	}
	public void showMembers() {
		library.showMembers();
	}
	public void addPaperBook(String title) {
		//library.addBook(new PaperBook(title));  // Book class constructor dependency
		library.addBook(paperBookFactory.createBook(title));
	}
	public void addEbook(String title) {
		//library.addBook(new Ebook(title));  // Book class constructor dependency
		library.addBook(eBookFactory.createBook(title));
	}
	public void addAudioBook(String title) {
		//library.addBook(new AudioBook(title));  // Book class constructor dependency
		library.addBook(audioBookFactory.createBook(title));
	}
	public void addRareBook(String title) {
		//library.addBook(new RareBook(title));  // Book class constructor dependency
		library.addBook(rareBookFactory.createBook(title));
	}
	public void addBook(BookFactory factory, String title) {
		library.addBook(factory.createBook(title));
	}
	public void addMember(String name) {
		library.addMember(new Member(name, borrowingService)); // Member class constructor dependency
	}
	public void removeBook(String title) {
		library.removeBook(title); // remove 
	}
	public void removeMember(String name) {
		library.removeMember(name);
	}
	public void showMember(String name) {
		Member member = library.findMemberByName(name);
		if (member != null)
			System.out.println(member);
		else 
			System.out.println("Member " + name + " not found.");
	}
	public void showBook(String title) {
		Book paperBook = library.findBookByTitle(title);
		if (paperBook != null)
			System.out.println(paperBook);
		else 
			System.out.println("Book " + title + " not found.");
	}
	public void showMemberBooks(String name) {
		Member member = library.findMemberByName(name);
		if (member != null)
			member.listBorrowedBooks();
		else 
			System.out.println("Member " + name + " not found.");
	}
	
	public void borrowBookByMember(String title, String name) {
		Member member = library.findMemberByName(name); // use library for search
		Book paperBook = library.findBookByTitle(title);  // use library for search
		if (paperBook != null && member != null)
			member.borrowBook(paperBook); // member borrows a book, not library 
		else 	
			System.out.println("Either book " + title + " or member " + name + " not found.");
	}
	
	public void returnBookByMember(String title, String name) {
		Member member = library.findMemberByName(name); // use library for search
		Book paperBook = library.findBookByTitle(title); // use library for search 
		if (paperBook != null && member != null)
			member.returnBook(paperBook); // members returns book. 
		else  	
			System.out.println("Either book " + title + " or member " + name + " not found.");
	}
}
