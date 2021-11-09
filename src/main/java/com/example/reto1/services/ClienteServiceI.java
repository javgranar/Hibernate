package com.example.reto1.services;

import java.util.List;

import com.example.reto1.entities.Cliente;

public interface ClienteServiceI {
	
	public void insertar(Cliente cliente);
	
	public Cliente searchById(Long idCliente);
	
	public List<Cliente> searchAll();
	
	public void actualizar(Cliente cliente);
	
	public void eliminar(Cliente cliente);
	
	public Cliente searchByNombre(String nombre);
	
	public Cliente searchByPrimerApellido(String nombre);
	
	public Cliente searchBySegundoApellido(String nombre);

}
