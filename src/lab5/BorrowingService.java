package lab5;

public class BorrowingService implements BorrowingServiceAPI {
	private static BorrowingService instance;
	public static BorrowingService getInstance(){
		if(instance == null){
			instance = new BorrowingService();
		}
		return instance;
	}
	@Override
	public BorrowingBookResult borrowBook(Member member, Book book) {
		
		BorrowingBookResult borrow=null;
		
		if(book.getIsAvailable()==false) {
			borrow= new BorrowingBookResult(false, "Book already borrowed.");
			return borrow;
		}
		
		if(member.getBorrowedBooks().size()==3) {
			borrow= new BorrowingBookResult(false, member.getName()+ " has already borrowed 3 books.");
			return borrow;
		}

		else {
			borrow = new BorrowingBookResult(true, "Book borrowed.");
			member.getBorrowedBooks().add(book);
			book.setIsAvailable(false);
					}
		return borrow;
	}
	
	@Override
	public BorrowingBookResult returnBook(Member member, Book book) {
		BorrowingBookResult returnedBook = null;
		if(!book.getIsAvailable()) {
			if(member.getBorrowedBooks().contains(book)) {
				book.setIsAvailable(true);
				member.getBorrowedBooks().remove(book);
				returnedBook = new BorrowingBookResult(true, "Book returned");
			}else {
				returnedBook = new BorrowingBookResult(false, "Member has not borrowed " + book.getTitle());
			}
		}else { 
			returnedBook = new BorrowingBookResult(false, book.getTitle() + " has already been returned");
		}
		return returnedBook;
	}
}
