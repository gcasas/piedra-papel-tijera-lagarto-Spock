package edu.tallerweb.pptls;

import static org.junit.Assert.*;
import org.junit.Test;

public class PartidaTests {

	@Test
	public void queSpockVaporizaPiedra() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.PIEDRA);
		
		Resultado resultado = jugadorUno.jugarCon(jugadorDos);
		
		assertEquals("Spock vaporiza piedra", Resultado.GANA, resultado);
	}

	@Test
	public void quePiedraAplasteTijera() {

		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.PIEDRA);
		
		Resultado resultado = jugadorUno.jugarCon(jugadorDos);
		
		assertEquals("Piedra aplasta tijera", Resultado.PIERDE, resultado);
	}
	@Test
	public void queUnaMismaFormaJuegueContraMismaFormaEnEsteCasoPiedra() {

		Mano jugadorUno = new Mano(Forma.PIEDRA);
		Mano jugadorDos = new Mano(Forma.PIEDRA);
		
		Resultado resultado = jugadorUno.jugarCon(jugadorDos);
		
		assertEquals("Piedra contra piedra empata", Resultado.EMPATA, resultado);
	}
}
