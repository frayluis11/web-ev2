package com.examen3.proyecto3.service;

import java.util.List;

import com.examen3.proyecto3.entity.Ingreso;

public interface IngresoService {
	
	public Ingreso registrar(Ingreso ingreso);
	public Ingreso actualizar(Ingreso ingreso);
	public void eliminar(Ingreso ingreso);
	public List<Ingreso>ver();
}
