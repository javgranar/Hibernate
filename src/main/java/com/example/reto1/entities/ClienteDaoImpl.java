package com.example.reto1.entities;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteDaoImpl implements ClienteDaoI{

	@Autowired
	private EntityManager entityManager;

	@Override
	public void insertar(Cliente cliente) {
		Session session = entityManager.unwrap(Session.class);
		
		session.save(cliente);
		
		session.close();
	}
	
	@Override
	public Cliente searchById(Long idCliente) {
		Session session = entityManager.unwrap(Session.class);

		Cliente cliente = (Cliente) session.createQuery("FROM Cliente WHERE id=" + idCliente).uniqueResult();

		session.close();
		
		return cliente;
	}

	@Override
	public List<Cliente> searchAll() {
		Session session = entityManager.unwrap(Session.class);
		
		@SuppressWarnings("unchecked")
		List<Cliente> clientes = session.createQuery("FROM Cliente").getResultList();
		
		session.close();
		
		return clientes;
	}

	@Override
	public void actualizar(Cliente cliente) {
		Session session = entityManager.unwrap(Session.class);
		
		session.update(cliente);
		
		session.close();
		
	}

	@Override
	public void eliminar(Cliente cliente) {
		Session session = entityManager.unwrap(Session.class);
		
		entityManager.remove(entityManager.merge(cliente));
		
		session.close();
		
		
	}

	@Override
	public Cliente searchByNombre(String nombre) {
		Session session = entityManager.unwrap(Session.class);

		Cliente cliente = (Cliente) session.createQuery("FROM Cliente WHERE nombre=" + nombre).uniqueResult();

		session.close();
		
		return cliente;
	}

	@Override
	public Cliente searchByPrimerApellido(String primer) {
		Session session = entityManager.unwrap(Session.class);

		Cliente cliente = (Cliente) session.createQuery("FROM Cliente WHERE primer_apellido=" + primer).uniqueResult();

		session.close();
		
		return cliente;
	}

	@Override
	public Cliente searchBySegundoApellido(String segundo) {
		Session session = entityManager.unwrap(Session.class);

		Cliente cliente = (Cliente) session.createQuery("FROM Cliente WHERE segundo_apellido=" + segundo).uniqueResult();

		session.close();
		
		return cliente;
	}

}