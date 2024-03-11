package com.citas.java.entities;

public class Medico extends Usuario{
 
    private Long registroMedico;
    private Especialidad especialidad;

   

    public Medico(int id, String nombres, String apellidos, TipoIdentificacion tipoIdentificacion, Long numeroIdentificacion,
    Long registroMedico, Especialidad especialidad) {
                //se llama o se invoca al contructor de la clase padre con super
                //la invocacion/llamado a super debe ser la primera instruccion 
                // en el contructoe de la clase hija 
        super(id, nombres, apellidos, tipoIdentificacion, numeroIdentificacion);
        //despues de llama al super los atributos de la clase hija
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }

    public Long getRegistroMedico() {
        return registroMedico;
    }

    public void setRegistroMedico(Long registroMedico) {
        this.registroMedico = registroMedico;
    }



    public Especialidad getEspecialidad() {
        return especialidad;
    }



    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    
    
}

