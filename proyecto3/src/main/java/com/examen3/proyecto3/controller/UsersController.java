package com.examen3.proyecto3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen3.proyecto3.entity.Users;
import com.examen3.proyecto3.service.UsersService;



@RestController
@RequestMapping("/mirar")
public class UsersController {
	@Autowired
	UsersService x;
	
	@PostMapping
	public Users registrar(@RequestBody Users users) {
		return x.registrar(users);
	}
	
	@PutMapping
	public Users actualizar(@RequestBody Users users) {
		return x.actualizar(users);
		
	}
	@DeleteMapping
	public void eliminar(@RequestBody  Users users) {
		x.eliminar(users);
	}
	
	@GetMapping
	public List<Users>ver(){
		return x.ver();
	}

}
