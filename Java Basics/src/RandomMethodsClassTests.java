import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RandomMethodsClassTests {

	@Test
	void onewordtest() {
		RandomMethodsToTest test = new RandomMethodsToTest();
		String output = test.firstAndLast("Pizza");
		assertEquals("Pa", output);
	}
	
	@Test 
	void sentencetest() {
		RandomMethodsToTest test = new RandomMethodsToTest();
		String output = test.firstAndLast("In the last days of easter, Jesus rose from the dead");
		assertEquals("Id", output);
	}
	
	@Test 
	void spacestest() {
		RandomMethodsToTest test = new RandomMethodsToTest();
		String output = test.firstAndLast("LEEEEEROOOOOOOOOOOY         JEEEEEEEEEEEEEEEENKINSSS");
		assertEquals("LS", output);
	}
	
	@Test
	void randomtest() {
		RandomMethodsToTest test = new RandomMethodsToTest();
		String output = test.firstAndLast("SIFFEN");
		assertEquals("SN", output);
	}

}
