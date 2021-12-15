package ISO2.Testing;

public class Persona {
	private boolean enferma;
	private boolean contactosRecientes;
	private boolean sintomas;
	private boolean pasaporteCovid;
	private boolean profesionalImprescindible;
	private int edad;
	
	public Persona(boolean enferma, boolean contactosRecientes, boolean sintomas, boolean pasaporteCovid,
			boolean profesionalImprescindible, int edad) {
		this.enferma = enferma;
		this.contactosRecientes = contactosRecientes;
		this.sintomas = sintomas;
		this.pasaporteCovid = pasaporteCovid;
		this.profesionalImprescindible = profesionalImprescindible;
		this.edad = edad;
	}

	public boolean isEnferma() {
		return enferma;
	}

	public boolean isContactosRecientes() {
		return contactosRecientes;
	}

	public boolean isSintomas() {
		return sintomas;
	}

	public boolean isPasaporteCovid() {
		return pasaporteCovid;
	}

	public boolean isProfesionalImprescindible() {
		return profesionalImprescindible;
	}

	public int getEdad() {
		return edad;
	}
}
