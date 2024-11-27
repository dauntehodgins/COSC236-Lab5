package lab5.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import lab5.BorrowingService;

public class TestSingleton {
	
	@Test public void TestSingleton(){
		
	BorrowingService service1 = BorrowingService.getInstance();
	
	BorrowingService service2 = BorrowingService.getInstance();
	
	assertEquals(service1,service2);
	}
}
