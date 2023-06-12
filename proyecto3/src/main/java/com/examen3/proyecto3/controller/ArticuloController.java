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

import com.examen3.proyecto3.entity.Articulo;
import com.examen3.proyecto3.service.ArticuloService;


@RestController
@RequestMapping("/muestra")
public class ArticuloController {
	@Autowired
	ArticuloService x;
	
	@PostMapping
	public Articulo registrar(@RequestBody Articulo articulo) {
		return x.registrar(articulo);
	}
	
	@PutMapping
	public Articulo actualizar(@RequestBody Articulo articulo) {
		return x.actualizar(articulo);
		
	}
	@DeleteMapping
	public void eliminar(@RequestBody Articulo articulo) {
		x.eliminar(articulo);
	}
	
	@GetMapping
	public List<Articulo>ver(){
		return x.ver();
	}

}
