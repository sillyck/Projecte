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

import com.example.demo.dto.Busca;
import com.example.demo.service.BuscaServiceIMPL;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class BuscaController {
	@Autowired
	BuscaServiceIMPL BuscaServiceImpl;

	@GetMapping("/Busca")
	public List<Busca> listarBuscas() {
		return BuscaServiceImpl.listarBusca();
	}

	@PostMapping("/Busca")
	public Busca salvarBusca(@RequestBody Busca Busca) {

		return BuscaServiceImpl.guardarBusca(Busca);
	}

	@GetMapping("/Busca/{id}")
	public Busca BuscaXID(@PathVariable(name = "Codigo") int Codigo) {

		Busca Busca_xid = new Busca();

		Busca_xid = BuscaServiceImpl.BuscaXID(Codigo);

		System.out.println("Busca XID: " + Busca_xid);

		return Busca_xid;
	}

	@PutMapping("/Busca/{id}")
	public Busca actualizarBusca(@PathVariable(name = "id") int Codigo, @RequestBody Busca Busca) {

		Busca Busca_seleccionado = new Busca();
		Busca Busca_actualizado = new Busca();

		Busca_seleccionado = BuscaServiceImpl.BuscaXID(Codigo);

		Busca_seleccionado.setId(Busca.getId());
		Busca_seleccionado.setUsuario(Busca.getUsuario());
		Busca_seleccionado.setHoteles(Busca.getHoteles());

		Busca_actualizado = BuscaServiceImpl.actualizarBusca(Busca_seleccionado);

		System.out.println("El Busca actualizado es: " + Busca_actualizado);

		return Busca_actualizado;
	}

	@DeleteMapping("/Busca/{id}")
	public void eliminarBusca(@PathVariable(name = "id") int Codigo) {
		BuscaServiceImpl.eliminarBusca(Codigo);
	}
}
