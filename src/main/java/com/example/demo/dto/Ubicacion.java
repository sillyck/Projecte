package com.example.demo.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="ubicacion")
public class Ubicacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	
	@Column(name = "latitud")//no hace falta si se llama igual
	private double latitud;
	
	@Column(name = "longitud")//no hace falta si se llama igual
	private double longitud;
	
	@OneToMany
	@JoinColumn(name = "id")
	private List<Ciudad> ciudad;

	public Ubicacion() {
		super();
	}

	public Ubicacion(int id, double latitud, double longitud, List<Ciudad> ciudad) {
		super();
		this.id = id;
		this.latitud = latitud;
		this.longitud = longitud;
		this.ciudad = ciudad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Ciudad")
	public List<Ciudad> getCiudad() {
		return ciudad;
	}

	public void setCiudad(List<Ciudad> ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return "Ubicacion [id=" + id + ", latitud=" + latitud + ", longitud=" + longitud + ", ciudad=" + ciudad + "]";
	}
	
}
