package com.examen3.proyecto3.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="Detalle_venta")
@Table(name="detalle_venta")
public class Detalle_venta {
	
	@Id
	String iddetalle_venta;
	String idventa;
	String idarticulo;
	int cantidad;
	double precio_venta;
	double descuento;
	
	public Detalle_venta() {
		super();
	}

	public Detalle_venta(String iddetalle_venta, String idventa, String idarticulo, int cantidad, double precio_venta,
			double descuento) {
		super();
		this.iddetalle_venta = iddetalle_venta;
		this.idventa = idventa;
		this.idarticulo = idarticulo;
		this.cantidad = cantidad;
		this.precio_venta = precio_venta;
		this.descuento = descuento;
	}

	public String getIddetalle_venta() {
		return iddetalle_venta;
	}

	public void setIddetalle_venta(String iddetalle_venta) {
		this.iddetalle_venta = iddetalle_venta;
	}

	public String getIdventa() {
		return idventa;
	}

	public void setIdventa(String idventa) {
		this.idventa = idventa;
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

	public double getPrecio_venta() {
		return precio_venta;
	}

	public void setPrecio_venta(double precio_venta) {
		this.precio_venta = precio_venta;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
	

}
