package com.examen3.proyecto3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen3.proyecto3.entity.Detalle_ingreso;
import com.examen3.proyecto3.repository.Detalle_ingresoRepository;

@Service
public class Detalle_ingresoServiceImpl implements Detalle_ingresoService{

	@Autowired
	Detalle_ingresoRepository x;
	@Override
	public Detalle_ingreso registrar(Detalle_ingreso detalle_ingreso) {
		// TODO Auto-generated method stub
		return x.save(detalle_ingreso);
	}

	@Override
	public Detalle_ingreso actualizar(Detalle_ingreso detalle_ingreso) {
		// TODO Auto-generated method stub
		return x.save(detalle_ingreso);
	}

	@Override
	public void eliminar(Detalle_ingreso detalle_ingreso) {
		// TODO Auto-generated method stub
		x.delete(detalle_ingreso);
	}

	@Override
	public List<Detalle_ingreso> ver() {
		// TODO Auto-generated method stub
		return x.findAll();
	}

}
