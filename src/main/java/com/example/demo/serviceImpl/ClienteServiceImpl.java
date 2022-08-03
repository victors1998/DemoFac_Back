package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Cliente;
import com.example.demo.repo.IClienteRepo;
import com.example.demo.service.IClienteService;

@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired
	private IClienteRepo data;
	
	@Override
	public Cliente registrar(Cliente obj) {
		return data.save(obj);
	}

	@Override
	public Cliente modificar(Cliente obj) {
		return data.save(obj);
	}

	@Override
	public List<Cliente> listar() {
		return data.findAll();
	}

}
