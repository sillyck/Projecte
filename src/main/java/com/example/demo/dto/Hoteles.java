package com.example.demo.dto;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="hoteles")
public class Hoteles {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	
	@Column(name = "paginaweb")//no hace falta si se llama igual
	private String paginaweb;
	
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	
	@Column(name = "categoria")//no hace falta si se llama igual
	private int categoria;
	
	@Column(name = "telefono")//no hace falta si se llama igual
	private int telefono;
	
	@Column(name = "precioNoche")//no hace falta si se llama igual
	private double precioNoche;
	
	@OneToMany
	@JoinColumn(name = "id")
	private List<Busca> busca;
	
	@OneToMany
	@JoinColumn(name = "id")
	private List<Situado> situado;

	public Hoteles() {
		super();
	}

	public Hoteles(int id, String paginaweb, String nombre, int categoria, int telefono, double precioNoche,
			List<Busca> busca, List<Situado> situado) {
		super();
		this.id = id;
		this.paginaweb = paginaweb;
		this.nombre = nombre;
		this.categoria = categoria;
		this.telefono = telefono;
		this.precioNoche = precioNoche;
		this.busca = busca;
		this.situado = situado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPaginaweb() {
		return paginaweb;
	}

	public void setPaginaweb(String paginaweb) {
		this.paginaweb = paginaweb;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public double getPrecioNoche() {
		return precioNoche;
	}

	public void setPrecioNoche(double precioNoche) {
		this.precioNoche = precioNoche;
	}

	public List<Busca> getBusca() {
		return busca;
	}

	public void setBusca(List<Busca> busca) {
		this.busca = busca;
	}

	public List<Situado> getSituado() {
		return situado;
	}

	public void setSituado(List<Situado> situado) {
		this.situado = situado;
	}

	@Override
	public String toString() {
		return "Hoteles [id=" + id + ", paginaweb=" + paginaweb + ", nombre=" + nombre + ", categoria=" + categoria
				+ ", telefono=" + telefono + ", precioNoche=" + precioNoche + ", busca=" + busca + ", situado="
				+ situado + "]";
	}
	
}
