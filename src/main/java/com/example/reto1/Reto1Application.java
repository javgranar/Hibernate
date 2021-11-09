package com.example.reto1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.reto1.entities.Cliente;
import com.example.reto1.services.ClienteServiceImpl;

@SpringBootApplication
public class Reto1Application implements CommandLineRunner{
	
	@Autowired
	private ClienteServiceImpl clienteSevice;

	public static void main(String[] args) {
		SpringApplication.run(Reto1Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		Cliente cliente1 = new Cliente();
		cliente1.setNombre("Javi");
		cliente1.setPrimerApellido("Granja");
		cliente1.setSegundoApellido("Naranjo");
		cliente1.setDni("12345678X");
		
		Cliente cliente2 = new Cliente();
		cliente2.setNombre("Javi2");
		cliente2.setPrimerApellido("Granja2");
		cliente2.setSegundoApellido("Naranjo2");
		cliente2.setDni("12345679X");
		
		clienteSevice.insertar(cliente1);
		clienteSevice.insertar(cliente2);
		
		List<Cliente> lista = new ArrayList<>();
		lista = clienteSevice.searchAll();
		System.out.println("Buscar todos " + lista.get(0).getNombre());
		System.out.println("Buscar todos " + lista.get(1).getNombre());
		
//		Cliente c = clienteSevice.searchByNombre("Javi2");
//		System.out.println("Buscar por nombre " + c.getNombre());
		
//		Long id = (long) 0;
//		Cliente modificacion = clienteSevice.searchById(id);
//		modificacion.setNombre("Jose");
//		clienteSevice.actualizar(modificacion);
		
		
		

	}
}
