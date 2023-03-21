package gestion.packages.idao;

import java.util.List;

public interface IDao<T> {
	
	T save(T o);
	
	T findById(int id);
	
	List<T> findAll();
	
	void delete(T o);
	void update(T o);
	
	

}
