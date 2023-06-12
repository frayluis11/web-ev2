package com.examen3.proyecto3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen3.proyecto3.entity.Venta;
import com.examen3.proyecto3.repository.VentaRepository;

@Service
public class VentaServiceImpl implements VentaService{

	@Autowired
	VentaRepository x;
	
	@Override
	public Venta registrar(Venta venta) {
		// TODO Auto-generated method stub
		return x.save(venta);
	}

	@Override
	public Venta actualizar(Venta venta) {
		// TODO Auto-generated method stub
		return x.save(venta);
	}

	@Override
	public void eliminar(Venta venta) {
		// TODO Auto-generated method stub
		x.delete(venta);
	}

	@Override
	public List<Venta> ver() {
		// TODO Auto-generated method stub
		return x.findAll();
	}

}
