package lab5.tests;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;


@Suite
@SelectClasses({TestAddRemoveBooks.class, 
				TestAddRemoveMembers.class,
				TestFindClassString.class,
				TestBorrowBooks.class,
				TestNotAvailableBook.class,
				TestRemoveMemberWithBooks.class,
				TestController.class,
				PaperBookTest.class,
				EBookTest.class,
				AudioBookTest.class,
				RareBookTest.class,
				BorrowingServiceTests.class,
				TestSingleton.class,
				TestMembersBorrowingService.class,
				TestBookFactory.class
				})
public class AllTests {
    // No need for test methods here; the suite will run the included classes
}

