package com.digitalhouse.projectointegrador.services;

import com.digitalhouse.projectointegrador.models.Turno;

import java.util.List;
import java.util.Optional;

public interface TurnoService {

    Turno guardar(Turno turno);

    Optional<Turno> buscar(Integer id);

    List<Turno> buscarTodos();

    void eliminar(Integer id);
}
