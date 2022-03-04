package com.example.demo.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="situado")
public class Situado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "ciudad_id")
	Ciudad ciudad;
	
	@ManyToOne
	@JoinColumn(name = "hoteles_id")
	Hoteles hoteles;

	public Situado() {
		super();
	}

	public Situado(int id, Ciudad ciudad, Hoteles hoteles) {
		super();
		this.id = id;
		this.ciudad = ciudad;
		this.hoteles = hoteles;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public Hoteles getHoteles() {
		return hoteles;
	}

	public void setHoteles(Hoteles hoteles) {
		this.hoteles = hoteles;
	}

	@Override
	public String toString() {
		return "Situado [id=" + id + ", ciudad=" + ciudad + ", hoteles=" + hoteles + "]";
	}
	
}
