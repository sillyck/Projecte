package com.example.demo.security;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.example.demo.dto.Usuario;
import com.fasterxml.jackson.databind.ObjectMapper;
public class JWRAuthorizationFilter extends UsernamePasswordAuthenticationFilter{
	
	private AuthenticationManager authenticationManager;
	
	public JWRAuthorizationFilter(AuthenticationManager authenticationManager) {
		this.authenticationManager = authenticationManager;
	}
	
	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
			try {
				Usuario cred = new ObjectMapper().readValue(request.getInputStream(), Usuario.class);
				return authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
						cred.getNombre(), cred.getPassword(), new ArrayList<>()));
			} catch(IOException e) {
				throw new RuntimeException(e);
		} 

		
	}
	
	
	

}
