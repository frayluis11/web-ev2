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

import com.examen3.proyecto3.entity.Categoria;
import com.examen3.proyecto3.service.CategoriaService;

@RestController
@RequestMapping("/muestras")
public class CategoriaController {
	@Autowired
	CategoriaService x;
	
	@PostMapping
	public Categoria registrar(@RequestBody Categoria categoria) {
		return x.registrar(categoria);
	}
	
	@PutMapping
	public Categoria actualizar(@RequestBody Categoria categoria) {
		return x.actualizar(categoria);
		
	}
	@DeleteMapping
	public void eliminar(@RequestBody Categoria categoria) {
		x.eliminar(categoria);
	}
	
	@GetMapping
	public List<Categoria>ver(){
		return x.ver();
	}

}
