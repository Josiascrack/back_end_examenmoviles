package com.backend.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.backend.interfaces.PersonaInterface;

@Repository
public class PersonaDao implements PersonaInterface{
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Map<String, Object>> listar() {
		List<Map<String, Object>>lista = jdbcTemplate.queryForList("Select * from persona;"); 
		return lista;
	}

}
