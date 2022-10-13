package com.backend.model;

public class Producto {
	private int idproducto;
	private String nombre;
	private Double precio;
	private Double stock;
	private String estado;
	private int idcategoria;
	

	
	public Producto(int idproducto, String nombre, Double precio, Double stock, String estado, int idcategoria) {
		super();
		this.idproducto = idproducto;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
		this.estado = estado;
		this.idcategoria = idcategoria;
	}
	
	public int getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Double getStock() {
		return stock;
	}
	public void setStock(Double stock) {
		this.stock = stock;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getIdcategoria() {
		return idcategoria;
	}
	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}
	
	
	
}
