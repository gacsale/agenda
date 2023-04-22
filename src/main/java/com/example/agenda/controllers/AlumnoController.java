package com.example.agenda.controllers;

import com.example.agenda.models.Alumno;
import com.example.agenda.repositories.AlumnoRepository;
import com.example.agenda.services.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alumnos")
@CrossOrigin(origins = {"http://localhost:3001", "http://localhost:3000", "http://localhost:4200"})
public class AlumnoController {
    @Autowired
    AlumnoService alumnoSrv;
//    AlumnoRepository alumnoRepo;
    @GetMapping()
    public List<Alumno> getAll() {
        return alumnoSrv.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Alumno> get(@PathVariable long id) {
        return alumnoSrv.get(id);
    }


    @PostMapping()
    public Alumno guardar(@RequestBody Alumno alumno) {
        return alumnoSrv.guardar(alumno);
    }

    @PutMapping("/{id}")
    public Alumno actualizar(@PathVariable long id, @RequestBody Alumno alumno) {
        return alumnoSrv.actualizar(alumno, id);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable long id) {
        alumnoSrv.remove(id);
    }


}
