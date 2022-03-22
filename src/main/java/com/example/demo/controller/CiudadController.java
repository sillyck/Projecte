package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.Ciudad;
import com.example.demo.service.CiudadServiceIMPL;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class CiudadController {

	@Autowired
	CiudadServiceIMPL CiudadServiceImpl;

	@GetMapping("/Ciudad")
	public List<Ciudad> listarCiudads() {
		return CiudadServiceImpl.listarCiudad();
	}

	@PostMapping("/Ciudad")
	public Ciudad salvarCiudad(@RequestBody Ciudad Ciudad) {

		return CiudadServiceImpl.guardarCiudad(Ciudad);
	}

	@GetMapping("/Ciudad/{id}")
	public Ciudad CiudadXID(@PathVariable(name = "Codigo") int Codigo) {

		Ciudad Ciudad_xid = new Ciudad();

		Ciudad_xid = CiudadServiceImpl.CiudadXID(Codigo);

		System.out.println("Ciudad XID: " + Ciudad_xid);

		return Ciudad_xid;
	}

	@PutMapping("/Ciudad/{id}")
	public Ciudad actualizarCiudad(@PathVariable(name = "id") int Codigo, @RequestBody Ciudad Ciudad) {

		Ciudad Ciudad_seleccionado = new Ciudad();
		Ciudad Ciudad_actualizado = new Ciudad();

		Ciudad_seleccionado = CiudadServiceImpl.CiudadXID(Codigo);

		Ciudad_seleccionado.setId(Ciudad.getId());
		Ciudad_seleccionado.setNombre(Ciudad.getNombre());
		Ciudad_seleccionado.setPoblacion(Ciudad.getPoblacion());
		Ciudad_seleccionado.setUbicacion(Ciudad.getUbicacion());

		Ciudad_actualizado = CiudadServiceImpl.actualizarCiudad(Ciudad_seleccionado);

		System.out.println("El Ciudad actualizado es: " + Ciudad_actualizado);

		return Ciudad_actualizado;
	}

	@DeleteMapping("/Ciudad/{id}")
	public void eliminarCiudad(@PathVariable(name = "id") int Codigo) {
		CiudadServiceImpl.eliminarCiudad(Codigo);
	}
	
}
