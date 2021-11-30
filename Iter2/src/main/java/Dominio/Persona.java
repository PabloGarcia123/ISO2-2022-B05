package Dominio;

public class Persona {

	private String idTarjeta;
	private String nombre;
	private String apellidos;
	private String estadoSalud;

	public String getIdTarjeta() {
		return this.idTarjeta;
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellidos() {
		return this.apellidos;
	}

	public String getEstadoSalud() {
		return this.estadoSalud;
	}

	public void setEstadoSalud(String estadoSalud) {
		this.estadoSalud = estadoSalud;
	}

	/**
	 * 
	 * @param idTarjeta
	 * @param nombre
	 * @param apellidos
	 * @param estadoSalud
	 */
	public Persona(String idTarjeta, String nombre, String apellidos, String estadoSalud) {
		// TODO - implement Persona.Persona
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idTarjeta
	 */
	public static Persona read(String idTarjeta) {
		// TODO - implement Persona.read
		throw new UnsupportedOperationException();
	}

	public int insert() {
		// TODO - implement Persona.insert
		throw new UnsupportedOperationException();
	}

	public int update() {
		// TODO - implement Persona.update
		throw new UnsupportedOperationException();
	}

}