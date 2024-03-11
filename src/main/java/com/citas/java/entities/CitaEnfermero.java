package com.citas.java.entities;

import java.time.LocalDateTime;

import com.citas.java.interfaces.IAgendable;

public class CitaEnfermero extends Cita implements IAgendable{
    private String procedimiento;
    private Enfermero enfermero;
    
    public CitaEnfermero(int id, LocalDateTime fecha, Paciente paciente, Consultorio consultorio, String procedimiento,
            Enfermero enfermero) {
        super(id, fecha, paciente, consultorio);
        this.procedimiento = procedimiento;
        this.enfermero = enfermero;
    }

    public String getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }

    public Enfermero getEnfermero() {
        return enfermero;
    }

    public void setEnfermero(Enfermero enfermero) {
        this.enfermero = enfermero;
    }

    @Override
    public void agendarCita(LocalDateTime fecha) {
        //se le esta asignando a la fecha de la cita (clase papa) - la fecha como parametro
        super.fecha = fecha;    
    }

    @Override
    public void cancelarCita() {
        System.out.println("Cita cancelada");
    }

    @Override
    public void reagendarCita(LocalDateTime fecha) {
        super.fecha = fecha;
    }
    
    
}
