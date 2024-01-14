package src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class Main_classTest {



//test cases to check the working of function calculating monthly rate

	@Test
	public void testMonthly_rate() {
		Main_class mc = new Main_class();
		assertEquals(0,mc.monthly_rate(0.0, 0.0));
		assertEquals(0,mc.monthly_rate(-2, -100));
		assertEquals(50,mc.monthly_rate(5000, 12));		
	}

/*	@Test
	public void testNumber_rate() {
		Main_class mc = new Main_class();
		assertEquals(0, mc.number_rate(0));		
		assertEquals(0, mc.number_rate(-1));
		assertEquals(1, mc.number_rate(12));
	}*/



//test cases to check the working of function calculating amount based on simple interest

	@Test
	public void testAmount_() {
		Main_class mc = new Main_class();
		assertEquals(0, mc.amount_(-1, -1, -1));
		assertEquals(0, mc.amount_(0, 0, 0));
		assertEquals(5300, mc.amount_(5000, 12, 6));
	}

/*	@Test
	void testMain() {
		//fail("Not yet implemented");
	}*/

}
