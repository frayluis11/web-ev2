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

import com.examen3.proyecto3.entity.Detalle_venta;
import com.examen3.proyecto3.service.Detalle_ventaService;



@RestController
@RequestMapping("/muestraras")
public class Detalle_ventaController {

	@Autowired
	Detalle_ventaService x;
	
	@PostMapping
	public Detalle_venta registrar(@RequestBody Detalle_venta detalle_venta) {
		return x.registrar(detalle_venta);
	}
	
	@PutMapping
	public Detalle_venta actualizar(@RequestBody Detalle_venta detalle_venta) {
		return x.actualizar(detalle_venta);
		
	}
	@DeleteMapping
	public void eliminar(@RequestBody Detalle_venta detalle_venta) {
		x.eliminar(detalle_venta);
	}
	
	@GetMapping
	public List<Detalle_venta>ver(){
		return x.ver();
	}
}
