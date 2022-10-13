package com.backend.model;

public class Categoria {
	private int idcategoria;
	private String nombre;
	private String estado;
	
	public Categoria() {
		super();
	}

	public Categoria(int idcategoria, String nombre, String estado) {
		super();
		this.idcategoria = idcategoria;
		this.nombre = nombre;
		this.estado = estado;
	}
	
	public int getIdcategoria() {
		return idcategoria;
	}
	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
}
