package lab5;

public class BorrowingService implements BorrowingServiceAPI {

	@Override
	public boolean borrowBook(Member member, Book book) {
		if(book.getIsAvailable()){
			member.getBorrowedBooks().add(book);
			book.setIsAvailable(false);
			System.out.println(member.getName() + " has succesfully borrowed: " + book.getTitle());
			return true;
		}
		System.out.println("Error borrowing: " + book.getTitle());
		return false;
	}
	@Override
	public boolean returnBook(Member member, Book book) {
		if(member.getBorrowedBooks().contains(book)) {
			book.setIsAvailable(true);
			member.getBorrowedBooks().remove(book);
			System.out.println(member.getName() + "has returned: " + book.getTitle());
			return true;
		}else {
			System.out.println("Member has not borrowed: " + book.getTitle());
		}
		return false;
	}
}
