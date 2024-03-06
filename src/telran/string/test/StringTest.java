package telran.string.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	@DisplayName("test of the method concat")
	void concatTest() {
		String hello="Hello";
		
		assertEquals("Hello World",hello.concat(" World"));
	}
	@Test
	void containsTest() {
		String hello="Hello";
		assertTrue(hello.contains("ell"));
		assertFalse(hello.contains("elo"));
	}
	@Test
	void compareToTest() {
		String hello="Hello";
		assertEquals(0,hello.compareTo("Hello"));
		assertEquals(-1,hello.compareTo("Helloo"));
		assertEquals(1,hello.compareTo("Hell"));
	}
	@Test
	void compareToIgnoreCaseTest() {
		String hello="Hello";
		assertEquals(0,hello.compareToIgnoreCase("hEllO"));
		assertEquals(-1,hello.compareToIgnoreCase("hElLoo"));
		assertEquals(1,hello.compareToIgnoreCase("HelL"));
	}
	@Test
	void startsWithTest() {
		String hello="Hello";
		assertTrue(hello.startsWith("H",0));
		assertFalse(hello.startsWith("elo",0));
		
	}
	@Test
	void endsWithTest() {
		String hello="Hello";
		assertTrue(hello.endsWith("o"));
		assertFalse(hello.endsWith("l"));
		
	}
	@Test
	void equalsIgnoreCaseTest() {
		String hello="Hello";
		assertTrue(hello.equalsIgnoreCase("hElLo"));
		assertFalse(hello.equalsIgnoreCase("Hell"));
		
	}
	@Test
	void indexOfTest() {
		String hello="Hello";
		assertEquals(1,hello.indexOf("e"));
		assertEquals(2,hello.indexOf("l"));
		assertEquals(-1,hello.indexOf("d"));
		assertEquals(-1,hello.indexOf("h"));
		
		
	}
	@Test
	void lastIndexOfTest() {
		String hello="Hello";
		assertEquals(4,hello.lastIndexOf("o"));
		assertEquals(-1,hello.lastIndexOf("d"));
		assertEquals(3,hello.lastIndexOf("l"));
		assertEquals(-1,hello.lastIndexOf("L"));
	}
	

}
