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
	public void registrar(Categoria cat) {
		data.save(cat);	
	}

	@Override
	public void editar(Categoria cat) {
		data.save(cat);
	}

	@Override
	public List<Categoria> listar() {		
		return data.findAll();
	}

}
