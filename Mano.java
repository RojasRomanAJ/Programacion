
public abstract class Mano {

	protected Carta[] cartas;
	protected int numCartas;
	
	static final int MAX = 20;
	public Mano() {
		numCartas = 0;
		cartas = new Carta[MAX];
	}
	
	public Mano(int num) {
		cartas = new Carta[num];
		numCartas = 0;
	}
	
	public void descartaTodo() {
		numCartas = 0;
	}
	
	public void addCarta(Carta c) {
		if(numCartas >= MAX)
			throw new RuntimeException("No puedes añadir mas cartas");
		cartas[numCartas] = c;
		numCartas++;
	}
	
	public int numDeCartas() {
		return numCartas;
	}
	
	public abstract double cuentaPuntos();
	
	public String toString() {
		String std = "";
		for(int i = 0; i < numCartas; i++) {
			std = std + "" + cartas[i];
		}
		return std;
	}
}
