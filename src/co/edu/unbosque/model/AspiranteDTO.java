package co.edu.unbosque.model;

public class AspiranteDTO {

	private long numDocumento;
	private String nombre;

	public AspiranteDTO() {
		// TODO Auto-generated constructor stub
	}

	public AspiranteDTO(long numDocumento, String nombre) {
		super();
		this.numDocumento = numDocumento;
		this.nombre = nombre;
	}

	public long getNumDocumento() {
		return numDocumento;
	}

	public void setNumDocumento(long numDocumento) {
		this.numDocumento = numDocumento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "AspiranteDTO [numDocumento=" + numDocumento + ", nombre=" + nombre + "]";
	}

	

}
