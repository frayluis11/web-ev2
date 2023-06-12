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

import com.examen3.proyecto3.entity.Detalle_ingreso;
import com.examen3.proyecto3.service.Detalle_ingresoService;



@RestController
@RequestMapping("/muestrara")
public class Detalle_ingresoController {
	@Autowired
	Detalle_ingresoService x;
	
	@PostMapping
	public Detalle_ingreso registrar(@RequestBody Detalle_ingreso detalle_ingreso) {
		return x.registrar(detalle_ingreso);
	}
	
	@PutMapping
	public Detalle_ingreso actualizar(@RequestBody Detalle_ingreso detalle_ingreso) {
		return x.actualizar(detalle_ingreso);
		
	}
	@DeleteMapping
	public void eliminar(@RequestBody Detalle_ingreso detalle_ingreso) {
		x.eliminar(detalle_ingreso);
	}
	
	@GetMapping
	public List<Detalle_ingreso>ver(){
		return x.ver();
	}

}
