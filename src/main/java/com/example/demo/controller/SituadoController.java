package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Situado;
import com.example.demo.service.SituadoServiceIMPL;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class SituadoController {

	@Autowired
	SituadoServiceIMPL SituadoServiceImpl;

	@GetMapping("/Situado")
	public List<Situado> listarSituados() {
		return SituadoServiceImpl.listarSituado();
	}

	@PostMapping("/Situado")
	public Situado salvarSituado(@RequestBody Situado Situado) {

		return SituadoServiceImpl.guardarSituado(Situado);
	}

	@GetMapping("/Situado/{id}")
	public Situado SituadoXID(@PathVariable(name = "Codigo") int Codigo) {

		Situado Situado_xid = new Situado();

		Situado_xid = SituadoServiceImpl.SituadoXID(Codigo);

		System.out.println("Situado XID: " + Situado_xid);

		return Situado_xid;
	}

	@PutMapping("/Situado/{id}")
	public Situado actualizarSituado(@PathVariable(name = "id") int Codigo, @RequestBody Situado Situado) {

		Situado Situado_seleccionado = new Situado();
		Situado Situado_actualizado = new Situado();

		Situado_seleccionado = SituadoServiceImpl.SituadoXID(Codigo);

		Situado_seleccionado.setId(Situado.getId());
		Situado_seleccionado.setCiudad(Situado.getCiudad());
		Situado_seleccionado.setHoteles(Situado.getHoteles());

		Situado_actualizado = SituadoServiceImpl.actualizarSituado(Situado_seleccionado);

		System.out.println("El Situado actualizado es: " + Situado_actualizado);

		return Situado_actualizado;
	}

	@DeleteMapping("/Situado/{id}")
	public void eliminarSituado(@PathVariable(name = "id") int Codigo) {
		SituadoServiceImpl.eliminarSituado(Codigo);
	}
	
}
