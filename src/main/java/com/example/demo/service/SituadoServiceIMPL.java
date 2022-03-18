package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ISituadoDAO;
import com.example.demo.dto.Situado;

@Service
public class SituadoServiceIMPL implements ISituadoService {

	@Autowired
	ISituadoDAO iSituadoDAO;
	
	@Override
	public List<Situado> listarSituado() {
		// TODO Auto-generated method stub
		return iSituadoDAO.findAll();
	}

	@Override
	public Situado guardarSituado(Situado Situado) {
		// TODO Auto-generated method stub
		return iSituadoDAO.save(Situado);
	}

	@Override
	public Situado SituadoXID(int id) {
		// TODO Auto-generated method stub
		return iSituadoDAO.findById(id).get();
	}

	@Override
	public Situado actualizarSituado(Situado Situado) {
		// TODO Auto-generated method stub
		return iSituadoDAO.save(Situado);
	}

	@Override
	public void eliminarSituado(int id) {
		// TODO Auto-generated method stub
		iSituadoDAO.deleteById(id);
	}
	
}
