package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Categoria;
import com.example.demo.repo.ICategoriaRepo;
import com.example.demo.service.ICategoriaService;

@Service  //---> se pone service para que spring lo pueda gestionar
public class CategoriaServiceImpl implements ICategoriaService{

	@Autowired
	private ICategoriaRepo data;
	
	@Override
	public Categoria registrar(Categoria obj) {
		return data.save(obj);	
	}

	@Override
	public List<Categoria> listar() {		
		return data.findAll();
	}

	@Override
	public Categoria modificar(Categoria obj) {	
		return data.save(obj);
	}

}
