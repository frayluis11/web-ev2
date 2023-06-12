package com.examen3.proyecto3.service;

import java.util.List;

import com.examen3.proyecto3.entity.Categoria;

public interface CategoriaService {
	
	public Categoria registrar(Categoria categoria);
	public Categoria actualizar(Categoria categoria);
	public void eliminar(Categoria categoria);
	public List<Categoria>ver();

}
