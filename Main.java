
public class Main {

	public static void main(String[] args) {
		// Aqui creamos el jugador, el mazo y la banca
		
		Baraja mazo = new Baraja();
		Juego jugador = new Juego();
		Juego banca = new Juego();
		
		//Aqui repartimos las cartas iniciales, una al jugador y otra a la banca
		
		jugador.addCarta(mazo.daCarta());
		banca.addCarta(mazo.daCarta());
		
		// El jugador pide carta
		
		while(jugador.cuentaPuntos() <= 5) {
			System.out.println("El jugador pide una carta extra");
			jugador.addCarta(mazo.daCarta());
		}
		
		// La banca para si el jugador se ha pasado, en caso contrario pide cartas
		
		if(jugador.cuentaPuntos() <= 7.5) {
			while(banca.puntos() < 7.5 && banca.cuentaPuntos() < jugador.cuentaPuntos()) {
				System.out.println("La banca pide una carta extra");
				banca.addCarta(mazo.daCarta());
			}
		}
		
		// Se cuentan los puntos obtenidos y se decide el ganador
		
		double puntosJ = jugador.cuentaPuntos();
		double puntosB = banca.cuentaPuntos();
		
		if(puntosJ <= 7.5 && (puntosB > 7.5 || puntosJ > puntosB)) {
			System.out.println("Gana el jugador: " + jugador);
		}
		else if (puntosB <= 7.5) {
			System.out.println("Gana la banca");
		}
		else {
			System.out.println("No hay ganador");
		}
	}

}
