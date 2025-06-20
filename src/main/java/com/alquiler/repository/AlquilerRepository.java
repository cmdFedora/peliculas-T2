package com.alquiler.repository;

import com.alquiler.model.Alquiler;
import com.alquiler.model.EstadoAlquiler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AlquilerRepository extends JpaRepository<Alquiler, Integer> {

List<Alquiler> findByEstado(EstadoAlquiler estado);

List<Alquiler> findByClienteId(int idCliente);

List<Alquiler> findByFecha(LocalDate fecha);

List<Alquiler> findByFechaBetween(LocalDate desde, LocalDate hasta);

List<Alquiler> findByClienteIdAndEstado(int idCliente, EstadoAlquiler estado);
}
