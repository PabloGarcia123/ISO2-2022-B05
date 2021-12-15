package ISO2.Testing;

public class Bus {
	private int plazas;
	private int pasajerosI;
	private int pasajerosN;
	
	public Bus(int plazas, int pasajerosI, int pasajerosN) {
		this.plazas = plazas;
		this.pasajerosI = pasajerosI;
		this.pasajerosN = pasajerosN;
	}

	public int getPlazas() {
		return plazas;
	}

	public int getPasajerosI() {
		return pasajerosI;
	}

	public int getPasajerosN() {
		return pasajerosN;
	}	
}
