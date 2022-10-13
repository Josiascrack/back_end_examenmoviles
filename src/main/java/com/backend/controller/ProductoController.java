package com.backend.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.model.Producto;
import com.backend.service.ProductoService;

@RestController
@RequestMapping(path = "/productos")
public class ProductoController {

	@Autowired
	ProductoService productoService;
	
	@GetMapping
	public List<Map<String, Object>>listar(){
		return productoService.list();
	}
	@GetMapping("/{id}")
	public List<Map<String, Object>>listId(@PathVariable int id){
		return productoService.listid(id);
	}
	@PostMapping
	public String add(@RequestBody Producto p) {
		int id = productoService.add(p);
		if (id == 0) {
			return "No se pudo registrar";
		}
		return "Se registró con éxito";
	}
	@PutMapping("/edit/{id}")
	public String edit(@RequestBody Producto p, @PathVariable int id) {
		p.setIdproducto(id);
		int r = productoService.edit(p);
		if (r==0) {
			System.out.println(r);
			return "No se pudo actualizar";
		}
		return "Se actualizó el registro";
	}
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		int r = productoService.delete(id);
		if (r == 0) {
			System.out.println(r);
			return "No se pudo eliminar";
		}
		return "Se elimino el registro";
	}
	
	
}
