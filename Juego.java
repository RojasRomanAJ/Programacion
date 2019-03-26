
public class Juego extends Mano {

	public double puntos() {
		double puntos = 0;
		for (int i = 0; i < numCartas; i++) {
			puntos += cartas[i].valoR();
		}
		return puntos;
	}

	@Override
	public double cuentaPuntos() {
		// TODO Auto-generated method stub
		return 0;
	}
}
