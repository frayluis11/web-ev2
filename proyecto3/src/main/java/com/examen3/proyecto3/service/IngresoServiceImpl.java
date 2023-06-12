package com.examen3.proyecto3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen3.proyecto3.entity.Ingreso;
import com.examen3.proyecto3.repository.IngresoRepository;

@Service
public class IngresoServiceImpl implements IngresoService{

	@Autowired
	IngresoRepository x;
	
	@Override
	public Ingreso registrar(Ingreso ingreso) {
		// TODO Auto-generated method stub
		return x.save(ingreso);
	}

	@Override
	public Ingreso actualizar(Ingreso ingreso) {
		// TODO Auto-generated method stub
		return x.save(ingreso);
	}

	@Override
	public void eliminar(Ingreso ingreso) {
		// TODO Auto-generated method stub
		x.delete(ingreso);
	}

	@Override
	public List<Ingreso> ver() {
		// TODO Auto-generated method stub
		return x.findAll();
	}

}
