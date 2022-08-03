package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Cliente;

public interface IClienteRepo extends JpaRepository<Cliente, Integer>{

}
