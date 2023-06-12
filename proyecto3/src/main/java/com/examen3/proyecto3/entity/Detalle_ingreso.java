package com.examen3.proyecto3.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="Detalle_ingreso")
@Table(name="detalle_ingreso")
public class Detalle_ingreso {
	@Id
	String iddetalle_ingreso;
	String idingreso;
	String idarticulo;
	int cantidad;
	double precio_compra;
	double precio_venta;
	
	public Detalle_ingreso() {
		super();
	}

	public Detalle_ingreso(String iddetalle_ingreso, String idingreso, String idarticulo, int cantidad,
			double precio_compra, double precio_venta) {
		super();
		this.iddetalle_ingreso = iddetalle_ingreso;
		this.idingreso = idingreso;
		this.idarticulo = idarticulo;
		this.cantidad = cantidad;
		this.precio_compra = precio_compra;
		this.precio_venta = precio_venta;
	}

	public String getIddetalle_ingreso() {
		return iddetalle_ingreso;
	}

	public void setIddetalle_ingreso(String iddetalle_ingreso) {
		this.iddetalle_ingreso = iddetalle_ingreso;
	}

	public String getIdingreso() {
		return idingreso;
	}

	public void setIdingreso(String idingreso) {
		this.idingreso = idingreso;
	}

	public String getIdarticulo() {
		return idarticulo;
	}

	public void setIdarticulo(String idarticulo) {
		this.idarticulo = idarticulo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio_compra() {
		return precio_compra;
	}

	public void setPrecio_compra(double precio_compra) {
		this.precio_compra = precio_compra;
	}

	public double getPrecio_venta() {
		return precio_venta;
	}

	public void setPrecio_venta(double precio_venta) {
		this.precio_venta = precio_venta;
	}
	
	
	
}
