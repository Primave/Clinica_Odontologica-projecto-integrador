package com.digitalhouse.projectointegrador.services.impl;

import com.digitalhouse.projectointegrador.models.Domicilio;
import com.digitalhouse.projectointegrador.repository.DomicilioRepository;
import com.digitalhouse.projectointegrador.services.DomicilioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DomicilioServiceImpl implements DomicilioService {

    private final DomicilioRepository domicilioRepository;

    @Autowired
    public DomicilioServiceImpl(DomicilioRepository domicilioRepository) {
        this.domicilioRepository = domicilioRepository;
    }

    @Override
    public Domicilio guardar(Domicilio domicilio){
        return domicilioRepository.save(domicilio);
    }

    @Override
    public Optional<Domicilio> buscar(Integer id){

        return domicilioRepository.findById(id);
    }

    @Override
    public List<Domicilio> buscarTodos(){

        return domicilioRepository.findAll();
    }

    @Override
    public void eliminar(Integer id){
        domicilioRepository.deleteById(id);
    }
}
