package com.example.demo.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="busca")
public class Busca {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "usuario_id")
	Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name = "hoteles_id")
	Hoteles hoteles;

	public Busca() {
		super();
	}

	public Busca(int id, Usuario usuario, Hoteles hoteles) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.hoteles = hoteles;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Hoteles getHoteles() {
		return hoteles;
	}

	public void setHoteles(Hoteles hoteles) {
		this.hoteles = hoteles;
	}

	@Override
	public String toString() {
		return "Busca [id=" + id + ", usuario=" + usuario + ", hoteles=" + hoteles + "]";
	}
	
}
