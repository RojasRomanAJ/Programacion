
public class Carta {

	public static enum Palo { ESPADAS, ORO, COPAS, BASTOS };
	private static String[] nombreCarta = { "AS", "2", "3", "4", "5", "6", "7",
											"8", "9", "J", "Q", "K" };
	
	private int valor;
	private Palo palo;
	
	public Carta(int v, Palo p) {
		valor = v;
		palo = p;
	}
	
	public int valoR() {return valor;}
	public Palo palo() {return palo;}
	public String toString() {
		return nombreCarta[valor-1] + " de " + palo;
	}
}
