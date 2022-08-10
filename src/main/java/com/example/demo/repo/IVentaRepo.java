package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Venta;

public interface IVentaRepo extends JpaRepository<Venta, Integer>{

}
