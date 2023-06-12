package com.examen3.proyecto3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen3.proyecto3.entity.Detalle_venta;
import com.examen3.proyecto3.repository.Detalle_ventaRepository;

@Service
public class Detalle_ventaServiceImpl implements Detalle_ventaService {

	@Autowired
	Detalle_ventaRepository x;
	@Override
	public Detalle_venta registrar(Detalle_venta detalle_venta) {
		// TODO Auto-generated method stub
		return x.save(detalle_venta);
	}

	@Override
	public Detalle_venta actualizar(Detalle_venta detalle_venta) {
		// TODO Auto-generated method stub
		return x.save(detalle_venta);
	}

	@Override
	public void eliminar(Detalle_venta detalle_venta) {
		// TODO Auto-generated method stub
		x.delete(detalle_venta);
	}

	@Override
	public List<Detalle_venta> ver() {
		// TODO Auto-generated method stub
		return x.findAll();
	}

}
