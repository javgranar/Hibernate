package com.example.reto1.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reto1.entities.Cliente;
import com.example.reto1.entities.ClienteDaoI;
import com.example.reto1.entities.Contrato;
import com.example.reto1.entities.ContratoDaoI;

@Service
public class ClienteServiceImpl implements ClienteServiceI{

	@Autowired
	private ClienteDaoI clienteDao;
	
	@Autowired
	private ContratoDaoI contratoDao;
	
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
	@Transactional
	public Cliente searchByPrimerApellido(String primer) {
		Cliente cliente = clienteDao.searchByPrimerApellido(primer);
		return cliente;
	}

	@Override
	@Transactional
	public Cliente searchBySegundoApellido(String segundo) {
		Cliente cliente = clienteDao.searchBySegundoApellido(segundo);
		return cliente;
	}

	@Override
	@Transactional
	public void insertar(Contrato contrato) {
		contratoDao.insertar(contrato);
		
	}

	@Override
	@Transactional
	public Contrato searchByIdContrato(Long idContrato) {
		Contrato contrato = contratoDao.searchById(idContrato);
		return contrato;
	}

	@Override
	@Transactional
	public List<Contrato> searchAllContratos() {
		List<Contrato> lista = contratoDao.searchAll();
		return lista;
	}

	@Override
	@Transactional
	public void actualizarContrato(Contrato contrato) {
		contratoDao.actualizar(contrato);
		
	}

	@Override
	@Transactional
	public void eliminarContrato(Contrato contrato) {
		contratoDao.eliminar(contrato);
		
	}

	@Override
	@Transactional
	public Contrato buscarContratoPorIdCliente(Long idCliente) {
		Contrato contrato = contratoDao.searchByIdCliente(idCliente);
		return contrato;
	}
	
}