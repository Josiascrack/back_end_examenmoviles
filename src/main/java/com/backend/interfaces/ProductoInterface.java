package com.backend.interfaces;

import java.util.List;
import java.util.Map;

import com.backend.model.Producto;

public interface ProductoInterface {
 public int add(Producto p);
 public int edit(Producto p);
 public int delete(int id);
 public List<Map<String, Object>>list();
 public List<Map<String, Object>>listid(int id);
}
