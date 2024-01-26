package co.edu.unbosque.model.persistence;

public interface CRUDOperation {

	public void create(String... args);

	public void create(Object o);

	public boolean update(int index, String... args);

	public boolean delete(int index);

	public boolean delete(Object o);

}
