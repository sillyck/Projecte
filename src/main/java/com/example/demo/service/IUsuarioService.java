package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IUsuarioDAO;

@Service
public interface IUsuarioService {
	@Autowired
	IUsuarioDAO iUsuarioDAO;
	
}
