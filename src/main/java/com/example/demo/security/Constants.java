package com.example.demo.security;

public class Constants {
	
	//Spring Security
	
	public static final String LOGIN_URL = "/login";
	public static final String HEADER_AUTHOR_KEY = "Authorization";
	public static final String TOKEN_BEARER_PREFIX = "Bearer";
	
	//JWT
	
	public static final String ISSUER_INFO = "Admin";
	public static final String SUPER_SECRET_KEY = "EJM123";
	public static final long TOKEN_EXPIRATION_TIME = 172800000; //2 DIAS
}
