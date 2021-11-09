package com.example.reto1.entities;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ContratoDaoImpl implements ContratoDaoI{
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public void insertar(Contrato contrato) {
		Session session = entityManager.unwrap(Session.class);
		
		session.save(contrato);
		
		session.close();
		
	}

	@Override
	public Contrato searchById(Long idContrato) {
		Session session = entityManager.unwrap(Session.class);

		Contrato contrato = (Contrato) session.createQuery("FROM Contrato WHERE id=" + idContrato).uniqueResult();

		session.close();
		
		return contrato;
	}

	@Override
	public List<Contrato> searchAll() {
		Session session = entityManager.unwrap(Session.class);
		
		@SuppressWarnings("unchecked")
		List<Contrato> contratos = session.createQuery("FROM Contratos").getResultList();
		
		session.close();
		
		return contratos;
	}

	@Override
	public void actualizar(Contrato contrato) {
		Session session = entityManager.unwrap(Session.class);
		
		session.update(contrato);
		
		session.close();
		
	}

	@Override
	public void eliminar(Contrato contrato) {
		Session session = entityManager.unwrap(Session.class);
		
		entityManager.remove(entityManager.merge(contrato));
		
		session.close();
		
	}

	@Override
	public Contrato searchByIdCliente(Long idCliente) {
		Session session = entityManager.unwrap(Session.class);

		Contrato contrato = (Contrato) session.createQuery("FROM Contrato WHERE id_cliente=" + idCliente).uniqueResult();

		session.close();
		
		return contrato;
	}

}
