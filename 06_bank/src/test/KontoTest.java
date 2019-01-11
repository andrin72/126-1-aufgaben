package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Konto;
import main.Kunde;

class KontoTest {

	@Test
	void testEinzahlen() {
		Kunde kunde = new Kunde("Muster", "Max", 1);
		Konto konto = new Konto(1, kunde);
		
		konto.einzahlen(500.75);
		assertTrue(500.75 == konto.getSaldo());
		
	}

}
