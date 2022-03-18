package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Ubicacion;

public interface IUbicacionService {

	public List<Ubicacion> listarUbicacion(); 
	
	public Ubicacion guardarUbicacion(Ubicacion Ubicacion);	
	
	public Ubicacion UbicacionXID(int id);
	
	public Ubicacion actualizarUbicacion(Ubicacion Ubicacion); 
	
	public void eliminarUbicacion(int id);
	
	
}
