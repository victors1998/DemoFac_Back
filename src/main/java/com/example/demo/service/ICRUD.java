package com.example.demo.service;

import java.util.List;

public interface ICRUD<T> {

	T registrar(T t);
	T modificar(T t);
	List<T> listar();
}
