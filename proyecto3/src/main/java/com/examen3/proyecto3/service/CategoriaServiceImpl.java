package com.examen3.proyecto3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen3.proyecto3.entity.Categoria;
import com.examen3.proyecto3.repository.CategoriaRepository;

@Service
public class CategoriaServiceImpl implements CategoriaService  {

	@Autowired
	CategoriaRepository x;
	@Override
	public Categoria registrar(Categoria categoria) {
		// TODO Auto-generated method stub
		return x.save(categoria);
	}

	@Override
	public Categoria actualizar(Categoria categoria) {
		// TODO Auto-generated method stub
		return x.save(categoria);
	}

	@Override
	public void eliminar(Categoria categoria) {
		// TODO Auto-generated method stub
		x.delete(categoria);
	}

	@Override
	public List<Categoria> ver() {
		// TODO Auto-generated method stub
		return x.findAll();
	}

}
