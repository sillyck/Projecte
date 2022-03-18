package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Ciudad;

public interface ICiudadService {

	public List<Ciudad> listarCiudad(); 
	
	public Ciudad guardarCiudad(Ciudad Ciudad);	
	
	public Ciudad CiudadXID(int id);
	
	public Ciudad actualizarCiudad(Ciudad Ciudad); 
	
	public void eliminarCiudad(int id);
	
}
