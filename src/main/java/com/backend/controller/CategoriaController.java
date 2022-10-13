package com.backend.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.service.CategoriaService;

@RestController
@RequestMapping(path = "/categorias")
public class CategoriaController {

	@Autowired
	CategoriaService categoriaService;
	
	@GetMapping
	List<Map<String, Object>>listar(){
		return categoriaService.listar();
	}

}
