package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fr.apriarsa.ws.soap.OperationServiceImpl;

class OperationServiceImplTest {

	@Test
	void testAddition() {
		OperationServiceImpl  service = new OperationServiceImpl();
		assertEquals(2, service.addition(1, 1));
	}

	@Test
	void testSoustraction() {
		// test 1
		OperationServiceImpl  service = new OperationServiceImpl();
		assertEquals(2, service.soustraction(3, 1));
	}

}
