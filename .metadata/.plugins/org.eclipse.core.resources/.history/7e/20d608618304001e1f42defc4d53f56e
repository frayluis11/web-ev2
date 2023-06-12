package com.examen3.proyecto3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen3.proyecto3.entity.Persona;
import com.examen3.proyecto3.service.PersonaService;



@RestController
@RequestMapping("/mostrar")
public class PersonaController {
	@Autowired
	PersonaService x;
	
	@PostMapping
	public Persona registrar(@RequestBody Persona persona) {
		return x.registrar(persona);
	}
	
	@PutMapping
	public Persona actualizar(@RequestBody Persona persona) {
		return x.actualizar(persona);
		
	}
	@DeleteMapping
	public void eliminar(@RequestBody Persona persona) {
		x.eliminar(persona);
	}
	
	@GetMapping
	public List<Persona>ver(){
		return x.ver();
	}

}
