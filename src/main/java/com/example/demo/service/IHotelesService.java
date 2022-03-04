package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Hoteles;

public interface IHotelesService {

	public List<Hoteles> listarHoteles(); 
	
	public Hoteles guardarHoteles(Hoteles Hoteles);	
	
	public Hoteles HotelesXID(int id);
	
	public Hoteles actualizarHoteles(Hoteles Hoteles); 
	
	public void eliminarHoteles(int id);
	
}
