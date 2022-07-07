package com.digitalhouse.projectointegrador.services.impl;

import com.digitalhouse.projectointegrador.models.login.Usuario;
import com.digitalhouse.projectointegrador.repository.UsuarioRepository;
import com.digitalhouse.projectointegrador.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario guardar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Optional<Usuario> buscar(Integer id) {
        return Optional.empty();
    }

    @Override
    public List<Usuario> buscarTodos() {
        return null;
    }

    @Override
    public void eliminar(Integer id) {

    }
}
