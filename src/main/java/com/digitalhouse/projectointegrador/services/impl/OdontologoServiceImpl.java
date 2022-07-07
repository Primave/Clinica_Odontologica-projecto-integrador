package com.digitalhouse.projectointegrador.services.impl;

import com.digitalhouse.projectointegrador.models.Odontologo;
import com.digitalhouse.projectointegrador.repository.OdontologoRepository;
import com.digitalhouse.projectointegrador.services.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OdontologoServiceImpl implements OdontologoService {

    private final OdontologoRepository odontologoRepository;


    @Autowired
    public OdontologoServiceImpl(OdontologoRepository odontologoRepository) {
        this.odontologoRepository = odontologoRepository;
    }


    @Override
    public Odontologo guardar(Odontologo odontologo) {
        return odontologoRepository.save(odontologo);
    }

    @Override
    public Optional<Odontologo> buscar(Integer id) {
        return odontologoRepository.findById(id);
    }

    @Override
    public List<Odontologo> buscarTodos() {
        return odontologoRepository.findAll();
    }

    //@Override
    //public Odontologo actualizar(Odontologo odontologo) {return odontologoRepository.save(odontologo);}

    @Override
    public void eliminar(Integer id) {
        odontologoRepository.deleteById(id);
    }
}
