package com.digitalhouse.projectointegrador.models;

import com.digitalhouse.projectointegrador.models.login.Usuario;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Odontologo extends Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nombre;
    private String apellido;

    @Column(name = "Matrícula")
    private Integer nroMatricula;

    @OneToMany(mappedBy = "odontologoAsignado", fetch = FetchType.LAZY)
    private Set<Turno> turnosAsignados = new HashSet<>();


    //Constructor
    public Odontologo() {
    }

    public Odontologo(String nombre, String apellido, Integer nroMatricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nroMatricula = nroMatricula;
    }


    //Get y Set
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getNroMatricula() {
        return nroMatricula;
    }

    public void setNroMatricula(Integer nroMatricula) {
        this.nroMatricula = nroMatricula;
    }

    public Set<Turno> getTurnosAsignados() {
        return turnosAsignados;
    }

    public void setTurnosAsignados(Set<Turno> turnosAsignados) {
        this.turnosAsignados = turnosAsignados;
    }

    //ToString
    @Override
    public String toString() {
        return "Odontologo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nroMatricula=" + nroMatricula +
                '}';
    }
}
