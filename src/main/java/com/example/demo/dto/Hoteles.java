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
	private String categoria;
	
	@Column(name = "telefono")//no hace falta si se llama igual
	private String telefono;
	
	@Column(name = "precioNoche")//no hace falta si se llama igual
	private String precioNoche;
	
	@OneToMany
	@JoinColumn(name = "id")
	private List<Busca> busca;
	
	@OneToMany
	@JoinColumn(name = "id")
	private List<Situado> situado;

	public Hoteles() {
		super();
	}

	public Hoteles(int id, String paginaweb, String nombre, String categoria, String telefono, String precioNoche,
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

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getPrecioNoche() {
		return precioNoche;
	}

	public void setPrecioNoche(String precioNoche) {
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
