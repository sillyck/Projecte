package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Situado;

public interface ISituadoService {

	public List<Situado> listarSituado(); 
	
	public Situado guardarSituado(Situado Situado);	
	
	public Situado SituadoXID(int id);
	
	public Situado actualizarSituado(Situado Situado); 
	
	public void eliminarSituado(int id);
	
	
}
