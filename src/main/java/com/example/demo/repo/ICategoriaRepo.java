package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Categoria;

public interface ICategoriaRepo extends JpaRepository<Categoria, Integer>{

}
