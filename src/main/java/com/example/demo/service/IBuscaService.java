package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Busca;

public interface IBuscaService {

	public List<Busca> listarBusca(); 
	
	public Busca guardarBusca(Busca Busca);	
	
	public Busca BuscaXID(int id);
	
	public Busca actualizarBusca(Busca Busca); 
	
	public void eliminarBusca(int id);
	
	
}
