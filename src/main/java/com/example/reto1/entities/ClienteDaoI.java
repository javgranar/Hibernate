package com.example.reto1.entities;

import java.util.List;

public interface ClienteDaoI {
	
	public void insertar(Cliente cliente);
	
	public Cliente searchById(Long idCliente);
	
	public Cliente searchByNombre(String nombre);
	
	public Cliente searchByPrimerApellido(String primer);
	
	public Cliente searchBySegundoApellido(String segundo);
	
	public List<Cliente> searchAll();
	
	public void actualizar(Cliente cliente);

	public void eliminar(Cliente cliente);

}
