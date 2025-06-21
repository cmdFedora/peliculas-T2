package com.alquiler.peliculas_webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String redireccionARaiz() {
        return "redirect:/alquileres";
    }
}