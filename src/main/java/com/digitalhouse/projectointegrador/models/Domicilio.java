package com.digitalhouse.projectointegrador.models;

import javax.persistence.*;

@Entity
@Table
public class Domicilio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String direccion;

    @OneToOne(mappedBy = "domicilio")
    private Paciente paciente;

    public Domicilio() {
    }

    public Domicilio(String direccion, Paciente paciente) {
        this.direccion = direccion;
        this.paciente = paciente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Domicilio{" +
                "id=" + id +
                ", direccion='" + direccion + '\'' +
                ", paciente=" + paciente +
                '}';
    }
}
