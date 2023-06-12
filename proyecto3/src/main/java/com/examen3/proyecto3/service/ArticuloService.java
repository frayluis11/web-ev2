package com.examen3.proyecto3.service;

import java.util.List;

import com.examen3.proyecto3.entity.Articulo;

public interface ArticuloService {

	public Articulo registrar(Articulo articulo);
	public Articulo actualizar(Articulo articulo);
	public void eliminar(Articulo articulo);
	public List<Articulo>ver();
}
