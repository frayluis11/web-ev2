package com.examen3.proyecto3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen3.proyecto3.entity.Persona;
import com.examen3.proyecto3.repository.PersonaRepository;

@Service
public class PersonaServiceImpl implements PersonaService{

	@Autowired
	PersonaRepository x;
	@Override
	public Persona registrar(Persona persona) {
		// TODO Auto-generated method stub
		return x.save(persona);
	}

	@Override
	public Persona actualizar(Persona persona) {
		// TODO Auto-generated method stub
		return x.save(persona);
	}

	@Override
	public void eliminar(Persona persona) {
		// TODO Auto-generated method stub
		x.delete(persona);
	}

	@Override
	public List<Persona> ver() {
		// TODO Auto-generated method stub
		return x.findAll();
	}

}
