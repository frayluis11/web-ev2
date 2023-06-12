package com.examen3.proyecto3.service;

import java.util.List;

import com.examen3.proyecto3.entity.Detalle_ingreso;

public interface Detalle_ingresoService {
	
	public Detalle_ingreso registrar(Detalle_ingreso detalle_ingreso);
	public Detalle_ingreso actualizar(Detalle_ingreso detalle_ingreso);
	public void eliminar(Detalle_ingreso detalle_ingreso);
	public List<Detalle_ingreso>ver();

}
