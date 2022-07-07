package com.digitalhouse.projectointegrador.repository;

import com.digitalhouse.projectointegrador.models.login.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
