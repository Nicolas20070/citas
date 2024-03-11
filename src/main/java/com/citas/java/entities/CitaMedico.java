package com.citas.java.entities;

import java.time.LocalDateTime;

import com.citas.java.interfaces.IAgendable;

public class CitaMedico extends Cita implements IAgendable{
    private String motivo;
    private Medico medico;
    private Estado estado;

    public CitaMedico(int id, LocalDateTime fecha, Paciente paciente, Consultorio consultorio, String motivo,
            Medico medico, Estado estado) {
        super(id, fecha, paciente, consultorio);
        this.motivo = motivo;
        this.medico = medico;
        this.estado = estado;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public void agendarCita(LocalDateTime fecha) {
        super.setFecha(fecha);
        this.estado = Estado.AGENDADA;
    }

    @Override
    public void cancelarCita() {
        
    }

    @Override
    public void reagendarCita(LocalDateTime fecha) {
        
    }
    
    
}
