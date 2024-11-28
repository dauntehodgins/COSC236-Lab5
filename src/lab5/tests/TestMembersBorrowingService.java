package lab5.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import lab5.BorrowingService;
import lab5.Member;

public class TestMembersBorrowingService {
	
	BorrowingService service = BorrowingService.getInstance();
	
	@Test
	public void TestMemberServices() {
		
		
		Member member1 = new Member("Member 1", service);
		
		Member member2 = new Member("member", service);
		
		assertEquals(member1.getBorrowingService(),member2.getBorrowingService());
		
	}
	
	

}
