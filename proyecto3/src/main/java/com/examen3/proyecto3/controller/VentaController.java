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

import com.examen3.proyecto3.entity.Venta;
import com.examen3.proyecto3.service.VentaService;



@RestController
@RequestMapping("/mirara")
public class VentaController {

	@Autowired
	VentaService x;
	
	@PostMapping
	public Venta registrar(@RequestBody Venta venta) {
		return x.registrar(venta);
	}
	
	@PutMapping
	public Venta actualizar(@RequestBody Venta venta) {
		return x.actualizar(venta);
		
	}
	@DeleteMapping
	public void eliminar(@RequestBody Venta venta) {
		x.eliminar(venta);
	}
	
	@GetMapping
	public List<Venta>ver(){
		return x.ver();
	}
}
