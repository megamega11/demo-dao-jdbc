package model.dao;

import java.util.List;

import model.entities.Departamento;
import model.entities.Vendedor;

public interface VendedorDao {
	
	void insert(Departamento obj);
	void update(Departamento obj);
	void deleteById(Integer id);
	Vendedor findById(Integer id);
	List<Vendedor> findAll();

}
