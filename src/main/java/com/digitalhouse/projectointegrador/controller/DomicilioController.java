package com.digitalhouse.projectointegrador.controller;

import com.digitalhouse.projectointegrador.models.Domicilio;
import com.digitalhouse.projectointegrador.services.DomicilioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/domicilios")
public class DomicilioController {

    @Autowired
    private DomicilioService domicilioService;

    @PostMapping()
    public ResponseEntity<Domicilio> guardar(@RequestBody Domicilio domicilio) {

        return ResponseEntity.ok(domicilioService.guardar(domicilio));

    }

    @GetMapping("/{id}")
    public ResponseEntity<Domicilio> buscar(@PathVariable Integer id) {
        Domicilio domicilio = domicilioService.buscar(id).orElse(null);

        return ResponseEntity.ok(domicilio);
    }

    @GetMapping
    public ResponseEntity<List<Domicilio>> buscarTodos(){
        return ResponseEntity.ok(domicilioService.buscarTodos());
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminar(@PathVariable Integer id) {
        ResponseEntity<String> response = null;

        if (domicilioService.buscar(id).isPresent()) {
            domicilioService.eliminar(id);
            response = ResponseEntity.status(HttpStatus.NO_CONTENT).body("Eliminado");
        } else {
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        return response;
    }

}
