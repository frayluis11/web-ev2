package com.examen3.proyecto3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen3.proyecto3.entity.Detalle_venta;

@Repository
public interface Detalle_ventaRepository extends JpaRepository<Detalle_venta, String> {

}
