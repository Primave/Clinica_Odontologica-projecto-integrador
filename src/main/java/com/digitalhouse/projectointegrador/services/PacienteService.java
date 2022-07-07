package com.digitalhouse.projectointegrador.services;

import com.digitalhouse.projectointegrador.models.Paciente;

import java.util.List;
import java.util.Optional;

public interface PacienteService {

    void guardar(Paciente paciente);

    Optional<Paciente> buscar(Integer id);

    List<Paciente> buscarTodos();

    void eliminar(Integer id);
}
