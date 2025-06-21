package com.alquiler.peliculas_webapp.controller;

import com.alquiler.peliculas_webapp.model.Alquiler;
import com.alquiler.peliculas_webapp.services.AlquilerService;
import com.alquiler.peliculas_webapp.services.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/alquileres")
public class AlquilerController {

    @Autowired
    private AlquilerService alquilerService;

    @Autowired
    private ClienteService clienteService;

    // Listar alquileres
    @GetMapping
    public String listarAlquileres(Model model) {
        model.addAttribute("alquileres", alquilerService.listarTodos());
        return "alquileres";
    }

    // Formulario de nuevo alquiler
    @GetMapping("/nuevo")
    public String mostrarFormularioNuevo(Model model) {
        model.addAttribute("alquiler", new Alquiler());
        model.addAttribute("clientes", clienteService.listarTodos());
        model.addAttribute("titulo", "Nuevo Alquiler");
        return "alquiler_form";
    }

    // Formulario de edición
    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable int id, Model model) {
        Alquiler alquiler = alquilerService.buscarPorId(id)
                .orElseThrow(() -> new IllegalArgumentException("ID inválido: " + id));
        model.addAttribute("alquiler", alquiler);
        model.addAttribute("clientes", clienteService.listarTodos());
        model.addAttribute("titulo", "Editar Alquiler");
        return "alquiler_form";
    }

    // Guardar (crear o actualizar)
    @PostMapping("/guardar")
    public String guardarAlquiler(@ModelAttribute("alquiler") Alquiler alquiler) {
        alquilerService.guardar(alquiler);
        return "redirect:/alquileres";
    }

    // Eliminar alquiler
    @GetMapping("/eliminar/{id}")
    public String eliminarAlquiler(@PathVariable int id) {
        alquilerService.eliminar(id);
        return "redirect:/alquileres";
    }
}