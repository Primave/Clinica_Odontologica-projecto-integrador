package com.digitalhouse.projectointegrador.services.impl;

import com.digitalhouse.projectointegrador.models.Turno;
import com.digitalhouse.projectointegrador.repository.TurnoRepository;
import com.digitalhouse.projectointegrador.services.TurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TurnoServiceImpl implements TurnoService {

    //instanciar repository
    private final TurnoRepository turnoRepository;

    @Autowired
    public TurnoServiceImpl(TurnoRepository turnoRepository) {
        this.turnoRepository = turnoRepository;
    }

    //Metodos a implementar
    @Override
    public Turno guardar(Turno turno){
        return turnoRepository.save(turno);
    }

    @Override
    public Optional<Turno> buscar(Integer id){

        return turnoRepository.findById(id);
    }

    @Override
    public List<Turno> buscarTodos(){
        return turnoRepository.findAll();
    }

    //public Turno actualizar(Turno turno){return turnoRepository.save(turno);}

    @Override
    public void eliminar(Integer id){
        turnoRepository.deleteById(id);
    }



}
