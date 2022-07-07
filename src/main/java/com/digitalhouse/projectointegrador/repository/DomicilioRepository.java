package com.digitalhouse.projectointegrador.repository;

import com.digitalhouse.projectointegrador.models.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DomicilioRepository extends JpaRepository<Domicilio, Integer> {

}
