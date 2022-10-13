package com.backend.interfaces;

import java.util.List;
import java.util.Map;

import com.backend.model.Categoria;

public interface CategoriaInterface {
	public int add(Categoria c);
	public int edit(Categoria c);
	public int delete (int id);
	public List<Map<String, Object>>listarId(int id);
	public List<Map<String, Object>>listar();
	
}
