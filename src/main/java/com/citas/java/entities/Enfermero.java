package com.citas.java.entities;

public class Enfermero extends Usuario{

    public Enfermero(int id, String nombres, String apellidos, TipoIdentificacion tipoIdentificacion,
            Long numeroIdentificacion) {
        super(id, nombres, apellidos, tipoIdentificacion, numeroIdentificacion);
    }
    
}

