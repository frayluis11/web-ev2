package com.examen3.proyecto3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen3.proyecto3.entity.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, String>{

}
