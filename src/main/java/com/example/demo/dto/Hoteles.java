package com.example.demo.dto;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="")
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
	
}
