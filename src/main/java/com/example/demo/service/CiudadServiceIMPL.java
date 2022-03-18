package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ICiudadDAO;
import com.example.demo.dto.Ciudad;

@Service
public class CiudadServiceIMPL implements ICiudadService {

	@Autowired
	ICiudadDAO iCiudadDAO;
	
	@Override
	public List<Ciudad> listarCiudad() {
		// TODO Auto-generated method stub
		return iCiudadDAO.findAll();
	}

	@Override
	public Ciudad guardarCiudad(Ciudad Ciudad) {
		// TODO Auto-generated method stub
		return iCiudadDAO.save(Ciudad);
	}

	@Override
	public Ciudad CiudadXID(int id) {
		// TODO Auto-generated method stub
		return iCiudadDAO.findById(id).get();
	}

	@Override
	public Ciudad actualizarCiudad(Ciudad Ciudad) {
		// TODO Auto-generated method stub
		return iCiudadDAO.save(Ciudad);
	}

	@Override
	public void eliminarCiudad(int id) {
		// TODO Auto-generated method stub
		iCiudadDAO.deleteById(id);
	}

	
	
}
