package co.edu.unbosque.model;

public class ProveedorDTO extends AspiranteDTO {

	public ProveedorDTO() {
		// TODO Auto-generated constructor stub
	}

	public ProveedorDTO(long numDocumento, String nombre) {
		super(numDocumento, nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() +  "ProveedorDTO []";
		
	}
	
}
