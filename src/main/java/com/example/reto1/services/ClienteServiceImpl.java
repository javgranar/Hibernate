package com.example.reto1.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reto1.entities.Cliente;
import com.example.reto1.entities.ClienteDaoI;

@Service
public class ClienteServiceImpl implements ClienteServiceI{

	@Autowired
	private ClienteDaoI clienteDao;
	
	@Override
	@Transactional
	public void insertar(Cliente cliente) {
		clienteDao.insertar(cliente);
	}

	@Override
	@Transactional
	public Cliente searchById(Long idCliente) {
		Cliente cliente = clienteDao.searchById(idCliente);
		return cliente;
	}

	@Override
	@Transactional
	public List<Cliente> searchAll() {
		List<Cliente> lista = clienteDao.searchAll();
		return lista;
	}

	@Override
	@Transactional
	public void actualizar(Cliente cliente) {
		clienteDao.actualizar(cliente);
		
	}

	@Override
	@Transactional
	public void eliminar(Cliente cliente) {
		clienteDao.eliminar(cliente);
		
	}

	@Override
	@Transactional
	public Cliente searchByNombre(String nombre) {
		Cliente cliente = clienteDao.searchByNombre(nombre);
		return cliente;
	}

	@Override
	public Cliente searchByPrimerApellido(String primer) {
		Cliente cliente = clienteDao.searchByPrimerApellido(primer);
		return cliente;
	}

	@Override
	public Cliente searchBySegundoApellido(String segundo) {
		Cliente cliente = clienteDao.searchBySegundoApellido(segundo);
		return cliente;
	}
	
	

}
