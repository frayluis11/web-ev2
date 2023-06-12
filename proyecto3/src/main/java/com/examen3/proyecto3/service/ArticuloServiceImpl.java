package com.examen3.proyecto3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen3.proyecto3.entity.Articulo;
import com.examen3.proyecto3.repository.ArticuloRepository;

@Service
public class ArticuloServiceImpl implements ArticuloService {

	@Autowired
	ArticuloRepository x;
	@Override
	public Articulo registrar(Articulo articulo) {
		// TODO Auto-generated method stub
		return x.save(articulo);
	}

	@Override
	public Articulo actualizar(Articulo articulo) {
		// TODO Auto-generated method stub
		return x.save(articulo);
	}

	@Override
	public void eliminar(Articulo articulo) {
		// TODO Auto-generated method stub
		x.delete(articulo);
	}

	@Override
	public List<Articulo> ver() {
		// TODO Auto-generated method stub
		return x.findAll();
	}

}
