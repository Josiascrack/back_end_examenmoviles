package com.backend.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.service.PersonaService;

@RestController
@RequestMapping(path = "/personas")
public class PersonaController {

	@Autowired
	PersonaService personService;
	
	@GetMapping("/")
	public List<Map<String, Object>>listar(){
		return personService.listar();
	}
	
	
}
