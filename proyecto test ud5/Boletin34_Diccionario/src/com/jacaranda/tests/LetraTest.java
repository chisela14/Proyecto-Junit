package com.jacaranda.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.jacaranda.lemas.Letra;

class LetraTest {

	@Test
	void testGetLetra() throws Exception {
		Letra target = new Letra('a');
		assertEquals(target.getLetra(),"A","Letra correcta");
	}

	@Test
	void testAddPalabra() {
		fail("Not yet implemented");
	}

	@Test
	void testBuscarPalabra() {
		fail("Not yet implemented");
	}

	@Test
	void testBorrarPalabra() {
		fail("Not yet implemented");
	}

	@Test
	void testListaPalabras() {
		fail("Not yet implemented");
	}

	@Test
	void testEqualsObject() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
