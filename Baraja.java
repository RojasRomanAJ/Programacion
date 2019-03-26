import java.util.Random;
public class Baraja {

	private static Random alea = new Random();
	private Carta[] mazo;
	private int numCartas;
	
	public Baraja() {
		mazo = new Carta[52]; //Creamos Array de cartas
		
		for(int i = 1; i < 13; i++) {
			for (Carta.Palo p : Carta.Palo.values()) {
			mazo[numCartas] = new Carta(i, p);
			numCartas++;
				
			}
		}
	}
	
	public void baraja() {
		for(int i = 0; i < numCartas; i++) {
			int a = alea.nextInt(numCartas);
			Carta c = mazo[i];
			mazo[i] = mazo[a];
			mazo[a] = c;
		}
	}
	
	public int numeroDeCartas() {
		return numCartas;
	}
	
	public Carta daCarta() {
		if(this.numeroDeCartas() == 0)
			throw new RuntimeException("No quedan cartas");
		numCartas--;
		return mazo[this.numeroDeCartas()];
	}
}
