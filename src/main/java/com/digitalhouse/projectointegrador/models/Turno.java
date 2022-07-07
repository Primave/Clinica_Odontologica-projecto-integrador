package com.digitalhouse.projectointegrador.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
public class Turno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private LocalDateTime fechaHora;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "paciente_id")
    private Paciente pacienteDelTurno;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "odontologo_id")
    private Odontologo odontologoAsignado;

    //Constructor
    public Turno() {
    }

    public Turno(LocalDateTime fechaHora, Paciente pacienteDelTurno, Odontologo odontologoAsignado) {
        this.fechaHora = fechaHora;
        this.pacienteDelTurno = pacienteDelTurno;
        this.odontologoAsignado = odontologoAsignado;
    }

    //Get y Set
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Paciente getPacienteDelTurno() {
        return pacienteDelTurno;
    }

    public void setPacienteDelTurno(Paciente pacienteDelTurno) {
        this.pacienteDelTurno = pacienteDelTurno;
    }

    public Odontologo getOdontologoAsignado() {
        return odontologoAsignado;
    }

    public void setOdontologoAsignado(Odontologo odontologoAsignado) {
        this.odontologoAsignado = odontologoAsignado;
    }

    @Override
    public String toString() {
        return "Turno{" +
                "id=" + id +
                ", fechaHora=" + fechaHora +
                ", pacienteDelTurno=" + pacienteDelTurno +
                ", odontologoAsignado=" + odontologoAsignado +
                '}';
    }
}
