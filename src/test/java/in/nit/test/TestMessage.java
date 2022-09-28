package in.nit.test;

import org.junit.jupiter.api.Test;

import in.nit.service.Message;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class TestMessage {

//	@Test
//	public void testA() {
//		String expected = "HELLO";
//		String actual = "HELLOS";
//		//Assertions.assertEquals(expected, actual);
//		assertEquals(expected, actual, "May be values are not similar");
//	}

	// Declare variables
	private Message m;
	private String expected;
	private String actual;

	// provide init-data
	@BeforeEach
	public void setUp() {
		m = new Message();
		expected = "Welcome to: Mr/Mrs/Ms :SAM";
		actual = "";
	}

	// Do Unit Test
	@Test
	public void testShowMsg() {
		actual = m.showMsg("SAM");
		assertEquals(expected, actual);

	}

	// clear heap data /clear memory.
	@AfterEach
	public void clean() {
		m = null;
		expected = actual = null;
	}
}
