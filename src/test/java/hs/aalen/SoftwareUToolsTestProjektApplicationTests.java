package hs.aalen;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SoftwareUToolsTestProjektApplicationTests {

	// Hilfsobjekt, das in den Tests geprueft wird
	methods t = new methods();

	// Prueft, ob der Spring Kontext ueberhaupt startet
	@Test
	void contextLoads() {
	}

	// Test 1: addiere() muss korrekt summieren
	@Test
	public void testAddiere() {
		assertEquals(5, t.addiere(2, 3));
	}

	// Test 2: gerade Zahl muss als gerade erkannt werden
	@Test
	public void testIstGeradeMitGeraderZahl() {
		assertTrue(t.istGerade(4));
	}

	// Test 3: ungerade Zahl darf nicht als gerade gelten
	@Test
	public void testIstGeradeMitUngeraderZahl() {
		assertFalse(t.istGerade(7));
	}

	// Test 4: Begruessung mit Name, und Fallback bei leerem Namen
	@Test
	public void testBegruessung() {
		assertEquals("Hallo Timo", t.begruessung("Timo"));
		assertEquals("Hallo Gast", t.begruessung(""));
	}
}
