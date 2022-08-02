package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Categoria;

public interface ICategoriaService {

	Categoria registrar (Categoria cat);
	void editar(Categoria cat);
	List<Categoria> listar();
}
