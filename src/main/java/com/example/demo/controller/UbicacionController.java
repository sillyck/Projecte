package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.dto.Ubicacion;
import com.example.demo.service.UbicacionServiceIMPL;

public class UbicacionController {

	@Autowired
	UbicacionServiceIMPL UbicacionServiceImpl;

	@GetMapping("/Ubicacion")
	public List<Ubicacion> listarUbicacions() {
		return UbicacionServiceImpl.listarUbicacion();
	}

	@PostMapping("/Ubicacion")
	public Ubicacion salvarUbicacion(@RequestBody Ubicacion Ubicacion) {

		return UbicacionServiceImpl.guardarUbicacion(Ubicacion);
	}

	@GetMapping("/Ubicacion/{id}")
	public Ubicacion UbicacionXID(@PathVariable(name = "Codigo") int Codigo) {

		Ubicacion Ubicacion_xid = new Ubicacion();

		Ubicacion_xid = UbicacionServiceImpl.UbicacionXID(Codigo);

		System.out.println("Ubicacion XID: " + Ubicacion_xid);

		return Ubicacion_xid;
	}

	@PutMapping("/Ubicacion/{id}")
	public Ubicacion actualizarUbicacion(@PathVariable(name = "id") int Codigo, @RequestBody Ubicacion Ubicacion) {

		Ubicacion Ubicacion_seleccionado = new Ubicacion();
		Ubicacion Ubicacion_actualizado = new Ubicacion();

		Ubicacion_seleccionado = UbicacionServiceImpl.UbicacionXID(Codigo);

		Ubicacion_seleccionado.setId(Ubicacion.getId());
		Ubicacion_seleccionado.setLatitud(Ubicacion.getLatitud());
		Ubicacion_seleccionado.setLongitud(Ubicacion.getLongitud());

		Ubicacion_actualizado = UbicacionServiceImpl.actualizarUbicacion(Ubicacion_seleccionado);

		System.out.println("El Ubicacion actualizado es: " + Ubicacion_actualizado);

		return Ubicacion_actualizado;
	}

	@DeleteMapping("/Ubicacion/{id}")
	public void eliminarUbicacion(@PathVariable(name = "id") int Codigo) {
		UbicacionServiceImpl.eliminarUbicacion(Codigo);
	}
	
}
