package com.citas.java.entities;

import java.time.LocalDate;


public class Paciente extends Usuario {
    
    private String correoElectronico;
    private Long celular;
    private LocalDate fechaNacimiento;
    private Double altura;
    private Double peso;
    private char factorRH;
    private TipoSangre tipoSangre;
    
  

    
    public Paciente(int id, String nombres, String apellidos, TipoIdentificacion tipoIdentificacion, Long numeroIdentificacion,
            String correoElectronico, Long celular, LocalDate fechaNacimiento, Double altura, Double peso,
            char factorRH, TipoSangre tipoSangre) {
        super(id, nombres, apellidos, tipoIdentificacion, numeroIdentificacion);
        this.correoElectronico = correoElectronico;
        this.celular = celular;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.peso = peso;
        this.factorRH = factorRH;
        this.tipoSangre = tipoSangre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Long getCelular() {
        return celular;
    }

    public void setCelular(Long celular) {
        this.celular = celular;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public char getFactorRH() {
        return factorRH;
    }

    public void setFactorRH(char factorRH) {
        this.factorRH = factorRH;
    }

    public TipoSangre getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(TipoSangre tipoSangre) {
        this.tipoSangre = tipoSangre;
    }


    
}
