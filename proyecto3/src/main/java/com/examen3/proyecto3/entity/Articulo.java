package com.examen3.proyecto3.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="Articulo")
@Table(name="articulo")
public class Articulo {
	
	@Id
	String idarticulo;
	String idcategoria;
	String codigo;
	String nombre;
	String stock;
	String descripcion;
	String imagen;
	String estado;
	
	public Articulo() {
		super();
	}

	public Articulo(String idarticulo, String idcategoria, String codigo, String nombre, String stock,
			String descripcion, String imagen, String estado) {
		super();
		this.idarticulo = idarticulo;
		this.idcategoria = idcategoria;
		this.codigo = codigo;
		this.nombre = nombre;
		this.stock = stock;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.estado = estado;
	}

	public String getIdarticulo() {
		return idarticulo;
	}

	public void setIdarticulo(String idarticulo) {
		this.idarticulo = idarticulo;
	}

	public String getIdcategoria() {
		return idcategoria;
	}

	public void setIdcategoria(String idcategoria) {
		this.idcategoria = idcategoria;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	

}
