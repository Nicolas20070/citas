package com.citas.java.interfaces;

import java.time.LocalDateTime;

public interface IAgendable {
    //Definir conportamiento que otras clase deben implementar
    //Implementar: generar el codigo fuente o instrucciones de los metodos}
    public void agendarCita(LocalDateTime fecha);
    public void cancelarCita();
    public void reagendarCita(LocalDateTime fecha);
}
