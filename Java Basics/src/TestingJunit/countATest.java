package TestingJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class countATest {

	@Test
	void test() {
		Methods test = new Methods();
		int output = test.countA("javabean");
		assertEquals(3, output);
	}

}
