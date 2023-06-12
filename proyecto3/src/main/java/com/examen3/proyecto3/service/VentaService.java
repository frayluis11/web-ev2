package com.examen3.proyecto3.service;

import java.util.List;

import com.examen3.proyecto3.entity.Venta;

public interface VentaService {

	public Venta registrar(Venta venta);
	public Venta actualizar(Venta venta);
	public void eliminar(Venta venta);
	public List<Venta>ver();
}
