package com.example.reto1.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "CONTRATO")
public class Contrato {
	
	private Long id;
	
	private Date fechaVigencia;
	
	private Date fechaCaducidad;

	private Double precio;
	
	private List<Cliente> listaAlumnos;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_UNIVERSIDAD", precision = 15)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "FECHA_VIGENCIA")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	public Date getFechaVigencia() {
		return fechaVigencia;
	}

	public void setFechaVigencia(Date fechaVigencia) {
		this.fechaVigencia = fechaVigencia;
	}
	
	@Column(name = "FECHA_CADUCIDAD")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	@Column(name = "PRECIO")
	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "cliente")
	public List<Cliente> getListaAlumnos() {
		return listaAlumnos;
	}

	public void setListaAlumnos(List<Cliente> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}
	
	

}
