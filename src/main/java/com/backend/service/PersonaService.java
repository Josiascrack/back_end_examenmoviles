package com.backend.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.dao.PersonaDao;
import com.backend.interfaces.PersonaInterface;

@Service
public class PersonaService implements PersonaInterface {
	@Autowired
	PersonaDao personaDao;

	@Override
	public List<Map<String, Object>> listar() {
		return personaDao.listar();
	}
}
