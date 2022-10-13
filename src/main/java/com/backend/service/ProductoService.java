package com.backend.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.dao.ProductoDao;
import com.backend.interfaces.ProductoInterface;
import com.backend.model.Producto;

@Service
public class ProductoService implements ProductoInterface{

	@Autowired
	ProductoDao productoDao;
	
	@Override
	public int add(Producto p) {
		return productoDao.add(p);
	}

	@Override
	public int edit(Producto p) {
		return productoDao.edit(p);
	}

	@Override
	public int delete(int id) {
		return productoDao.delete(id);
	}

	@Override
	public List<Map<String, Object>> list() {
		return productoDao.list();
	}

	@Override
	public List<Map<String, Object>> listid(int id) {
		return productoDao.listid(id);
	}

}
