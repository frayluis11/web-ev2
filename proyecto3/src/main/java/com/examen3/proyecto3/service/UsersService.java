package com.examen3.proyecto3.service;

import java.util.List;

import com.examen3.proyecto3.entity.Users;

public interface UsersService {

	public Users registrar(Users users);
	public Users actualizar(Users users);
	public void eliminar(Users users);
	public List<Users>ver();
}
