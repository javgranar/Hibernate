package com.example.reto1.entities;

import java.util.List;

public interface ContratoDaoI {
	
	public void insertar(Contrato contrato);
	
	public Contrato searchById(Long idContrato);
	
	public Contrato searchByIdCliente(Long idCliente);
	
	public List<Contrato> searchAll();
	
	public void actualizar(Contrato contrato);

	public void eliminar(Contrato contrato);

}
