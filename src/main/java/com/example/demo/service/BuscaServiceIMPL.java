package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IBuscaDAO;
import com.example.demo.dto.Busca;

@Service
public class BuscaServiceIMPL implements IBuscaService {

	@Autowired
	IBuscaDAO iBuscaDAO;
	
	@Override
	public List<Busca> listarBusca() {
		// TODO Auto-generated method stub
		return iBuscaDAO.findAll();
	}

	@Override
	public Busca guardarBusca(Busca Busca) {
		// TODO Auto-generated method stub
		return iBuscaDAO.save(Busca);
	}

	@Override
	public Busca BuscaXID(int id) {
		// TODO Auto-generated method stub
		return iBuscaDAO.findById(id).get();
	}

	@Override
	public Busca actualizarBusca(Busca Busca) {
		// TODO Auto-generated method stub
		return iBuscaDAO.save(Busca);
	}

	@Override
	public void eliminarBusca(int id) {
		// TODO Auto-generated method stub
		iBuscaDAO.deleteById(id);
	}
	
}
