package com.digitalhouse.projectointegrador.repository;

import com.digitalhouse.projectointegrador.models.Odontologo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OdontologoRepository extends JpaRepository<Odontologo, Integer> {

}
