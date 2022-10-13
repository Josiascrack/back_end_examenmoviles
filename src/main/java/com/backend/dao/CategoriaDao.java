package com.backend.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.backend.interfaces.CategoriaInterface;
import com.backend.model.Categoria;

@Repository
public class CategoriaDao implements CategoriaInterface{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
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
		List<Map<String, Object>>list = jdbcTemplate.queryForList("Select * from categorias where estado = 1;");
		return list;
	}

}
