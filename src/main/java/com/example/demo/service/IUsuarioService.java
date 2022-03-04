package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IUsuarioDAO;
import com.example.demo.dto.Usuario;

@Service
public interface IUsuarioService {
	@Autowired
	IUsuarioDAO iUsuarioDAO;
	
}
