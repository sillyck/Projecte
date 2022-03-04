package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.Ciudad;

public interface ICiudadDAO extends JpaRepository<Ciudad, Integer>{

}
