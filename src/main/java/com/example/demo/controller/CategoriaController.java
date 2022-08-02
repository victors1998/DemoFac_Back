package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Categoria;
import com.example.demo.service.ICategoriaService;

@RestController   //INDICAMOS QUE ES UN SERVICIO REST
@RequestMapping("/categorias")
public class CategoriaController {

	@Autowired
	private ICategoriaService service;
	
	@GetMapping
	public List<Categoria> listar(){
		return service.listar();
	}
	
	@PostMapping
	public void guardar(@Validated @RequestBody Categoria cat) {
		service.registrar(cat);
	}
	
	@PutMapping
	public void actualizar(@Validated @RequestBody Categoria cat) {
		service.editar(cat);
	}
	
}
