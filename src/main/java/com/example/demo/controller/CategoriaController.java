package com.example.demo.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponents;

import com.example.demo.model.Categoria;
import com.example.demo.service.ICategoriaService;

@RestController   //INDICAMOS QUE ES UN SERVICIO REST
@RequestMapping("/categorias")
public class CategoriaController {

	@Autowired
	private ICategoriaService service;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> listar(){
		List<Categoria> listar = service.listar();
		return new ResponseEntity<List<Categoria>>(listar, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Object> guardar(@Validated @RequestBody Categoria cat) {
	     Categoria categoria =service.registrar(cat);
	   //  UriComponents location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(categoria.getIdCategoria());
	    URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(categoria.getIdCategoria()).toUri();
		return ResponseEntity.created(location).build();
	}
	
	@PutMapping
	public ResponseEntity<Object> modificar (@Validated @RequestBody Categoria cat) {
		service.editar(cat);
		return new ResponseEntity<Object>(HttpStatus.CREATED);
	}
	
}
