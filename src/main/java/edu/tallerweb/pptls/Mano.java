package edu.tallerweb.pptls;

/**
 * Representa una de las Manos involucradas en el juego
 */
public class Mano {
	
	private Forma forma;

	/**
	 * Toda Mano debe crearse con una forma dada, que será
	 * la que determine su condición en el juego.
	 * @param forma, la Forma que adopta la Mano.
	 */
	public Mano(final Forma forma) {
		this.forma = forma;
	}

	/**
	 * Evaluará el resultado de la partida según las reglas
	 * del juego.
	 * @param otra, la otra Mano.
	 * @return un Resultado, de acuerdo al estado del juego.
	 */
	public Resultado jugarCon(final Mano otra) {
		
		if (this.forma == otra.forma) {
			return Resultado.EMPATA;
		}
		
		switch (this.forma) {
			case PIEDRA:
				if (otra.forma == Forma.PAPEL || otra.forma == Forma.SPOCK) {
					return Resultado.PIERDE;
				}
				
				break;
				
			case PAPEL:
				if (otra.forma == Forma.TIJERA || otra.forma == Forma.LAGARTO) {
					return Resultado.PIERDE;
				}
				
				break;
				
			case TIJERA:
				if (otra.forma == Forma.PIEDRA || otra.forma == Forma.SPOCK) {
					return Resultado.PIERDE;
				}
				
				break;
				
			case LAGARTO:
				if (otra.forma == Forma.TIJERA || otra.forma == Forma.PIEDRA) {
					return Resultado.PIERDE;
				}
				
				break;
				
			case SPOCK:
				if (otra.forma == Forma.PAPEL || otra.forma == Forma.LAGARTO) {
					return Resultado.PIERDE;
				}
				
				break;
		}
		
		return Resultado.GANA;
	}
}