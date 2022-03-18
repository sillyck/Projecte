package com.example.demo.service;

import static java.util.Collections.emptyList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IUsuarioDAO;
import com.example.demo.dto.Usuario;

@Service
public class UsuarioServiceIMPL implements UserDetailsService {
	private IUsuarioDAO iUsuarioDAO;
	
	public UsuarioServiceIMPL(IUsuarioDAO iUsuarioDAO) {
		this.iUsuarioDAO = iUsuarioDAO;
	}

	@Override
	public UserDetails loadUserByUsername(String nombre) throws UsernameNotFoundException {
		Usuario usuario = iUsuarioDAO.findByUsername(nombre);
		if (usuario == null) {
			throw new UsernameNotFoundException(nombre);
		}
		return new User(usuario.getNombre(), usuario.getPassword(), emptyList());
	}

}
