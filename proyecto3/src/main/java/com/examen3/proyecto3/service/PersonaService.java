package com.examen3.proyecto3.service;

import java.util.List;

import com.examen3.proyecto3.entity.Persona;

public interface PersonaService {

	public Persona registrar(Persona persona);
	public Persona actualizar(Persona persona);
	public void eliminar(Persona persona);
	public List<Persona>ver();
}
