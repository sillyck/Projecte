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
	 * @param telefono
	 */
	public Usuario(String nombre, String apellidos, String correo, String password, int telefono) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.correo = correo;
		this.password = password;
		this.telefono = telefono;
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
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * 
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * 
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * 
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * 
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * 
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * 
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * 
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * 
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * 
	 * @return the telefono
	 */
	public int getTelefono() {
		return telefono;
	}

	/**
	 * 
	 * @param telefono the telefono to set
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	/**
	 * 
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * 
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * 
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
	
	
	
	
}
