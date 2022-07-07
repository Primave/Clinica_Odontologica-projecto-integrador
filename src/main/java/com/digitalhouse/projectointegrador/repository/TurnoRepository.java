package com.digitalhouse.projectointegrador.repository;

import com.digitalhouse.projectointegrador.models.Turno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurnoRepository extends JpaRepository<Turno, Integer> {

}
