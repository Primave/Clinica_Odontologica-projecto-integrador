package com.digitalhouse.projectointegrador.controller;

import com.digitalhouse.projectointegrador.models.Turno;
import com.digitalhouse.projectointegrador.services.TurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turnos")
public class TurnoController {

    //instanciar service
    @Autowired
    private TurnoService turnoService;


    //Endpoints dos metodos a implementar
@PostMapping()
public ResponseEntity<Turno> guardar(@RequestBody Turno turno) {
    return ResponseEntity.ok(turnoService.guardar(turno));
}

    @GetMapping("/{id}")
    public ResponseEntity<Turno> buscar(@PathVariable Integer id) {
        Turno turno = turnoService.buscar(id).orElse(null);

        return ResponseEntity.ok(turno);
    }

    @GetMapping
    public ResponseEntity<List<Turno>> buscarTodos(){
        return ResponseEntity.ok(turnoService.buscarTodos());
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminar(@PathVariable Integer id) {
        ResponseEntity<String> response = null;

        if (turnoService.buscar(id).isPresent()) {
            turnoService.eliminar(id);
            response = ResponseEntity.status(HttpStatus.NO_CONTENT).body("Eliminado");
        } else {
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        return response;
    }



}
