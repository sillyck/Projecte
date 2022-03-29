package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.Hoteles;
import com.example.demo.service.HotelesServiceIMPL;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class HotelesController {

	@Autowired
	HotelesServiceIMPL hotelesServiceImpl;

	@GetMapping("/Hoteles")
	public List<Hoteles> listarHoteless() {
		return hotelesServiceImpl.listarHoteles();
	}

	@PostMapping("/Hoteles")
	public Hoteles salvarHoteles(@RequestBody Hoteles Hoteles) {

		return hotelesServiceImpl.guardarHoteles(Hoteles);
	}

	@GetMapping("/Hoteles/{id}")
	public Hoteles HotelesXID(@PathVariable(name = "id") int Codigo) {

		Hoteles Hoteles_xid = new Hoteles();

		Hoteles_xid = hotelesServiceImpl.HotelesXID(Codigo);

		return Hoteles_xid;

	}

	@PutMapping("/Hoteles/{id}")
	public Hoteles actualizarHoteles(@PathVariable(name = "id") int Codigo, @RequestBody Hoteles Hoteles) {

		Hoteles Hoteles_seleccionado = new Hoteles();
		Hoteles Hoteles_actualizado = new Hoteles();

		Hoteles_seleccionado = hotelesServiceImpl.HotelesXID(Codigo);

		Hoteles_seleccionado.setId(Hoteles.getId());
		Hoteles_seleccionado.setPaginaweb(Hoteles.getPaginaweb());
		Hoteles_seleccionado.setNombre(Hoteles.getNombre());
		Hoteles_seleccionado.setCategoria(Hoteles.getCategoria());
		Hoteles_seleccionado.setTelefono(Hoteles.getTelefono());
		Hoteles_seleccionado.setLatitud(Hoteles.getLatitud());
		Hoteles_seleccionado.setLongitud(Hoteles.getLongitud());
		Hoteles_seleccionado.setBusca(Hoteles.getBusca());
		Hoteles_seleccionado.setSituado(Hoteles.getSituado());

		Hoteles_actualizado = hotelesServiceImpl.actualizarHoteles(Hoteles_seleccionado);

		return Hoteles_actualizado;
	}

	@DeleteMapping("/Hoteles/{id}")
	public void eliminarHoteles(@PathVariable(name = "id") int Codigo) {
		hotelesServiceImpl.eliminarHoteles(Codigo);
	}
}
