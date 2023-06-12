package com.examen3.proyecto3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen3.proyecto3.entity.Users;
import com.examen3.proyecto3.repository.UsersRepository;

@Service
public class UsersServiceImpl implements UsersService{

	@Autowired
	UsersRepository x;
	
	@Override
	public Users registrar(Users users) {
		// TODO Auto-generated method stub
		return x.save(users);
	}

	@Override
	public Users actualizar(Users users) {
		// TODO Auto-generated method stub
		return x.save(users);
	}

	@Override
	public void eliminar(Users users) {
		// TODO Auto-generated method stub
		x.delete(users);
	}

	@Override
	public List<Users> ver() {
		// TODO Auto-generated method stub
		return x.findAll();
	}

}
