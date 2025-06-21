package com.alquiler.peliculas_webapp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "peliculas")
@Data  
@NoArgsConstructor  
@AllArgsConstructor  
@Builder  
public class Pelicula {

    @Id
    @Column(name = "id_pelicula")
    private int id;

    @NotNull
    @Column(name = "titulo", nullable = false, length = 100)
    private String titulo;

    @NotNull
    @Column(name = "genero", nullable = false, length = 50)
    private String genero;

    @NotNull
    @Column(name = "stock", nullable = false)
    private int stock;
}
