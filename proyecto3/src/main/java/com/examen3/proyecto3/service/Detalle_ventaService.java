package com.examen3.proyecto3.service;

import java.util.List;

import com.examen3.proyecto3.entity.Detalle_venta;

public interface Detalle_ventaService {
	
	public Detalle_venta registrar(Detalle_venta detalle_venta);
	public Detalle_venta actualizar(Detalle_venta detalle_venta);
	public void eliminar(Detalle_venta detalle_venta);
	public List<Detalle_venta>ver();

}
