package com.digitalhouse.projectointegrador.services;

import com.digitalhouse.projectointegrador.models.Odontologo;

import java.util.List;
import java.util.Optional;

public interface OdontologoService {

    Odontologo guardar(Odontologo odontologo);

    Optional<Odontologo> buscar(Integer id);

    List<Odontologo> buscarTodos();

    void eliminar(Integer id);
}
