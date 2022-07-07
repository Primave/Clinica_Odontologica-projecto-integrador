package com.digitalhouse.projectointegrador.services.impl;

import com.digitalhouse.projectointegrador.models.Paciente;
import com.digitalhouse.projectointegrador.repository.PacienteRepository;
import com.digitalhouse.projectointegrador.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PacienteServiceImpl implements PacienteService {

    private final PacienteRepository pacienteRepository;

    @Autowired
    public PacienteServiceImpl(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    @Override
    public void guardar(Paciente paciente) {
        pacienteRepository.save(paciente);
    }

    @Override
    public Optional<Paciente> buscar(Integer id) {
        return pacienteRepository.findById(id);
    }

    @Override
    public List<Paciente> buscarTodos() {
        return pacienteRepository.findAll();
    }

//    public Paciente actualizar(Paciente paciente) {return pacienteRepository.save(paciente);}

    @Override
    public void eliminar(Integer id) {
        pacienteRepository.deleteById(id);
    }


}

