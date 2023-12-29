package src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Main_classTest {

	@Test
	void testMonthly_rate() {
		Main_class mc = new Main_class();
		assertEquals(0,mc.monthly_rate(0.0, 0.0));
		assertEquals(0,mc.monthly_rate(-2, -100));
		assertEquals(50,mc.monthly_rate(5000, 12));		
	}

	@Test
	void testNumber_rate() {
		Main_class mc = new Main_class();
		assertEquals(0, mc.number_rate(0));		
		assertEquals(0, mc.number_rate(-1));
		assertEquals(1, mc.number_rate(12));
	}

	@Test
	void testAmount_() {
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
