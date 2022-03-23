package com.example.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ciudad")
public class Ciudad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	
	@Column(name = "poblacion")//no hace falta si se llama igual
	private double poblacion;
	
	@ManyToOne
	@JoinColumn(name = "cod_ubicacion")
	Ubicacion ubicacion;

	public Ciudad() {
		super();
	}

	public Ciudad(int id, String nombre, double poblacion, Ubicacion ubicacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.poblacion = poblacion;
		this.ubicacion = ubicacion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(double poblacion) {
		this.poblacion = poblacion;
	}

	public Ubicacion getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}

	@Override
	public String toString() {
		return "Ciudad [id=" + id + ", nombre=" + nombre + ", poblacion=" + poblacion + ", ubicacion=" + ubicacion
				+ "]";
	}
	
}
