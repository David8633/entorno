package actividades;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static actividades.A4_1.contarPalabras;
import static actividades.A4_1. contarLetrasDiferentes;
import static actividades.A4_1.contarFrecuenciaLetras;

class tets {

	@Test
	void testContarPalabra() {
		assertEquals(0,contarPalabras(" "));
	}
	
	@Test
	void testContarLetrasDiferentes() {
		assertEquals(5,contarLetrasDiferentes("palabra")) ;
	}

	@Test
	void testContarFrecunciaLetras() {
		assertEquals(("de"==2,"la"==2,"mama"==4),contarFrecuenciaLetras("La mama de la mama de la mama"));
	}
}
