package com.backend.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.backend.interfaces.ProductoInterface;
import com.backend.model.Producto;

@Repository
public class ProductoDao implements ProductoInterface{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public int add(Producto p) {
		String sql = "Insert into productos (nombre, precio, stock, estado,idcategoria) "
			    + " values (?,?,?,?,?)";
 	return jdbcTemplate.update(sql, p.getNombre(),p.getPrecio(),p.getStock(), p.getEstado(),p.getIdcategoria());
	}

	@Override
	public int edit(Producto p) {
		String sql = "UPDATE productos "
				+ "SET nombre = ?, precio = ?, stock = ?, estado = ?, idcategoria = ? "
				+ "WHERE idproducto = ?;";
 	return jdbcTemplate.update(sql, p.getNombre(),p.getPrecio(),p.getStock(), p.getEstado(),p.getIdcategoria(),p.getIdproducto());
	}
	@Override
	public int delete(int id) {
		String sql = "Update productos set estado = '0' where idproducto = ?";
		return jdbcTemplate.update(sql, id);
	}

	@Override
	public List<Map<String, Object>> list() {
		List<Map<String, Object>>list = jdbcTemplate.queryForList("Select * from productos where estado = 1");
		return list;
	}

	@Override
	public List<Map<String, Object>> listid(int id) {
		List<Map<String, Object>>list = jdbcTemplate.queryForList("Select * from productos where idproducto = ? and estado = 1", id);
		return list;
	}

}
