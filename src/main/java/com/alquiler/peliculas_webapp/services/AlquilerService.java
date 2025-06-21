package com.alquiler.peliculas_webapp.services;

import com.alquiler.peliculas_webapp.model.Alquiler;
import com.alquiler.peliculas_webapp.model.EstadoAlquiler;
import com.alquiler.peliculas_webapp.repository.AlquilerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class AlquilerService {

@Autowired
private AlquilerRepository alquilerRepository;

public List<Alquiler> listarTodos() {
    return alquilerRepository.findAll();
    }

public Optional<Alquiler> buscarPorId(int id) {
    return alquilerRepository.findById(id);
    }

public Alquiler guardar(Alquiler alquiler) {
    return alquilerRepository.save(alquiler);
    }

public void eliminar(int id) {
    alquilerRepository.deleteById(id);
    }

public List<Alquiler> buscarPorEstado(EstadoAlquiler estado) {
    return alquilerRepository.findByEstado(estado);
    }

public List<Alquiler> buscarPorCliente(int idCliente) {
    return alquilerRepository.findByClienteId(idCliente);
    }

public List<Alquiler> buscarPorFecha(LocalDate fecha) {
    return alquilerRepository.findByFecha(fecha);
    }

public List<Alquiler> buscarPorRangoFechas(LocalDate desde, LocalDate hasta) {
    return alquilerRepository.findByFechaBetween(desde, hasta);
    }

public List<Alquiler> buscarPorClienteYEstado(int idCliente, EstadoAlquiler estado) {
return alquilerRepository.findByClienteIdAndEstado(idCliente, estado);
    }
}
