package com.alquiler.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "detalle_alquiler")
@IdClass(DetalleAlquilerId.class)
@Data  
@NoArgsConstructor  
@AllArgsConstructor  
@Builder  
public class DetalleAlquiler {

    @Id
    @Column(name = "id_alquiler")
    private int idAlquiler;

    @Id
    @Column(name = "id_pelicula")
    private int idPelicula;

    @ManyToOne
    @JoinColumn(name = "id_alquiler", insertable = false, updatable = false)
    private Alquiler alquiler;

    @ManyToOne
    @JoinColumn(name = "id_pelicula", insertable = false, updatable = false)
    private Pelicula pelicula;

    @NotNull
    @Column(name = "cantidad", nullable = false)
    private int cantidad;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado", nullable = false)
    private EstadoAlquiler estado;
}
