package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IHotelesDAO;
import com.example.demo.dto.Hoteles;

@Service
public class HotelesServiceIMPL implements IHotelesService {

	@Autowired
	IHotelesDAO iHotelesDAO;
	
	@Override
	public List<Hoteles> listarHoteles() {
		return iHotelesDAO.findAll();
	}

	@Override
	public Hoteles guardarHoteles(Hoteles Hoteles) {
		return iHotelesDAO.save(Hoteles);
	}

	@Override
	public Hoteles HotelesXID(int id) {
		return iHotelesDAO.findById(id).get();
	}

	@Override
	public Hoteles actualizarHoteles(Hoteles Hoteles) {
		return iHotelesDAO.save(Hoteles);
	}

	@Override
	public void eliminarHoteles(int id) {
		iHotelesDAO.deleteById(id);
	}

	
	
}
