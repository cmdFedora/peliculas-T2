package com.alquiler.peliculas_webapp.model;

import lombok.Getter;

@Getter  
public enum EstadoAlquiler {
    ACTIVO,
    DEVUELTO,
    RETRASADO;
}