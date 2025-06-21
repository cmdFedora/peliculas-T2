package com.alquiler.peliculas_webapp.model;

import java.io.Serializable;
import lombok.*;

@Data  
@NoArgsConstructor  
@AllArgsConstructor  
public class DetalleAlquilerId implements Serializable {

    private int idAlquiler;
    private int idPelicula;
}