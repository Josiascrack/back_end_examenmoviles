package com.backend.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.dao.CategoriaDao;
import com.backend.interfaces.CategoriaInterface;
import com.backend.model.Categoria;

@Service
public class CategoriaService implements CategoriaInterface{

	@Autowired
	CategoriaDao categoriaDao;
	
	@Override
	public int add(Categoria c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int edit(Categoria c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Map<String, Object>> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> listar() {
		return categoriaDao.listar();
	}

}
