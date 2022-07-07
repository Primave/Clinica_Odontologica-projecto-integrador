package com.digitalhouse.projectointegrador.services;

import com.digitalhouse.projectointegrador.models.login.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    Usuario guardar(Usuario usuario);

    Optional<Usuario> buscar(Integer id);

    List<Usuario> buscarTodos();

    void eliminar(Integer id);
}
