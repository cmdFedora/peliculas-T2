package com.alquiler.peliculas_webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alquiler.peliculas_webapp.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    // Ya incluye métodos básicos: findAll, findById, save, deleteById, etc.
}