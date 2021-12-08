package Dominio;

public class Ciudadano {

	private int tfno;
	private String nivelVulnerabilidad;
	private String persona;

	public int getTfno() {
		return this.tfno;
	}

	public String getNivelVulnerabilidad() {
		return this.nivelVulnerabilidad;
	}

	public String getPersona() {
		return this.persona;
	}

	/**
	 * 
	 * @param tfno
	 * @param nivelVulnerabilidad
	 * @param persona
	 */
	public Ciudadano(int tfno, String nivelVulnerabilidad, String persona) {
		// TODO - implement Ciudadano.Ciudadano
		throw new UnsupportedOperationException();
	}

	public boolean avisar() {
		// TODO - implement Ciudadano.avisar
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param tfno
	 */
	public static Ciudadano read(int tfno) {
		// TODO - implement Ciudadano.read
		throw new UnsupportedOperationException();
	}

	public int insert() {
		// TODO - implement Ciudadano.insert
		throw new UnsupportedOperationException();
	}

	public int update() {
		// TODO - implement Ciudadano.update
		throw new UnsupportedOperationException();
	}

}