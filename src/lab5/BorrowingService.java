package lab5;

public class BorrowingService implements BorrowingServiceAPI {

	@Override
	public BorrowingBookResult borrowBook(Member member, Book book) {
		BorrowingBookResult borrow = null;
		if(member.getBorrowedBooks().size() <= 3) {
			if(book.getIsAvailable()){
				member.getBorrowedBooks().add(book);
				book.setIsAvailable(false);
				borrow = new BorrowingBookResult(true, "Book borrowed");
			}else {
				borrow = new BorrowingBookResult(false, "Book already borrowed");
			}
		}else {
			borrow = new BorrowingBookResult(false, member.getName() + " has already borrowed 3 books.");
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
