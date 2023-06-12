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

import com.examen3.proyecto3.entity.Ingreso;
import com.examen3.proyecto3.service.IngresoService;



@RestController
@RequestMapping("/ver")
public class IngresoController {

	@Autowired
	IngresoService x;
	
	@PostMapping
	public Ingreso registrar(@RequestBody Ingreso ingreso) {
		return x.registrar(ingreso);
	}
	
	@PutMapping
	public Ingreso actualizar(@RequestBody Ingreso ingreso) {
		return x.actualizar(ingreso);
		
	}
	@DeleteMapping
	public void eliminar(@RequestBody Ingreso ingreso) {
		x.eliminar(ingreso);
	}
	
	@GetMapping
	public List<Ingreso>ver(){
		return x.ver();
	}
}
