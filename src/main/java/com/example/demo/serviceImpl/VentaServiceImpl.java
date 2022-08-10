package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Venta;
import com.example.demo.repo.IVentaRepo;
import com.example.demo.service.IVentaService;

@Service
public class VentaServiceImpl implements IVentaService{

	@Autowired
	private IVentaRepo data;
	
	@Override
	public Venta registrar(Venta obj) {
		return data.save(obj);
	}

	@Override
	public Venta modificar(Venta obj) {
		return data.save(obj);
	}

	@Override
	public List<Venta> listar() {
		return data.findAll();
	}

}
