package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IUbicacionDAO;
import com.example.demo.dto.Ubicacion;

@Service
public class UbicacionServiceIMPL implements IUbicacionService {

	@Autowired
	IUbicacionDAO iUbicacionDAO;
	
	@Override
	public List<Ubicacion> listarUbicacion() {
		// TODO Auto-generated method stub
		return iUbicacionDAO.findAll();
	}

	@Override
	public Ubicacion guardarUbicacion(Ubicacion Ubicacion) {
		// TODO Auto-generated method stub
		return iUbicacionDAO.save(Ubicacion);
	}

	@Override
	public Ubicacion UbicacionXID(int id) {
		// TODO Auto-generated method stub
		return iUbicacionDAO.findById(id).get();
	}

	@Override
	public Ubicacion actualizarUbicacion(Ubicacion Ubicacion) {
		// TODO Auto-generated method stub
		return iUbicacionDAO.save(Ubicacion);
	}

	@Override
	public void eliminarUbicacion(int id) {
		// TODO Auto-generated method stub
		iUbicacionDAO.deleteById(id);
	}

	
	
}
