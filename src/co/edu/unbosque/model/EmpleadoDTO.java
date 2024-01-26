package co.edu.unbosque.model;

public class EmpleadoDTO extends AspiranteDTO  {

	public EmpleadoDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public EmpleadoDTO(long numDocumento, String nombre) {
		super(numDocumento, nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() + "EmpleadoDTO []";
	}
	
	
	
}
