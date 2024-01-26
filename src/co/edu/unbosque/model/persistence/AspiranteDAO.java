package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.AspiranteDTO;

public class AspiranteDAO implements CRUDOperation {

	private ArrayList<AspiranteDTO> lista;
	
	public AspiranteDAO() {
		lista = new ArrayList<>();
		
	}
	@Override
	public void create(String... args) {
		AspiranteDTO aspirante = new AspiranteDTO();
		aspirante.setNombre(args [0]);
		aspirante.setNumDocumento(Integer.parseInt(args[1]));
		lista.add(aspirante);
	}

	@Override
	public void create(Object o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean update(int index, String... args) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int index) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
	

	

}
