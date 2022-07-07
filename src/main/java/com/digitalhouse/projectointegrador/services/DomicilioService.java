package com.digitalhouse.projectointegrador.services;

import com.digitalhouse.projectointegrador.models.Domicilio;

import java.util.List;
import java.util.Optional;


public interface DomicilioService {

    Domicilio guardar(Domicilio domicilio);

    Optional<Domicilio> buscar(Integer id);

    List<Domicilio> buscarTodos();

    void eliminar(Integer id);

}
