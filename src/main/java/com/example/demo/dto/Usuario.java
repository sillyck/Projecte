package com.example.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name= "usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="dni")
	private String dni;
	@Column(name="nombre")
	private String nombre;
	@Column(name="apellidos")
	private String apellidos;
	@Column(name="edad")
	private int edad;
	@Column(name="correo")
	private String correo;
	@Column(name="telefono")
	private int telefono;
	@Column(name="password")
	private String password;
	@Column(name="role")
	private String role;
	
	public Usuario() {
		
	}
	
	/**
	 * @param nombre
	 * @param apellidos
	 * @param correo
	 * @param password
	 */
	public Usuario(String nombre, String apellidos, String correo, String password) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.correo = correo;
		this.password = password;
	}
	
	/**
	 * @param id
	 * @param dni
	 * @param nombre
	 * @param apellidos
	 * @param edad
	 * @param correo
	 * @param telefono
	 * @param password
	 * @param role
	 */
	public Usuario(int id, String dni, String nombre, String apellidos, int edad, String correo, int telefono,
			String password, String role) {
		//super();
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.correo = correo;
		this.telefono = telefono;
		this.password = password;
		this.role = role;
	}

	/**
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 
	 * @return
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * 
	 * @param dni
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @return
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * 
	 * @param apellidos
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * 
	 * @return
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * 
	 * @param edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * 
	 * @return
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * 
	 * @param correo
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * 
	 * @return
	 */
	public int getTelefono() {
		return telefono;
	}

	/**
	 * 
	 * @param telefono
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	/**
	 * 
	 * @return
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 
	 * @return
	 */
	public String getRole() {
		return role;
	}

	/**
	 * 
	 * @param role
	 */
	public void setRole(String role) {
		this.role = role;
	}
	
	
	
	
}
