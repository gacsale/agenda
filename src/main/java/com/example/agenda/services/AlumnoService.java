package com.example.agenda.services;

import com.example.agenda.models.Alumno;
import com.example.agenda.repositories.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AlumnoService {

    @Autowired
    AlumnoRepository alumnoRepo;

    public List<Alumno> getAll() {
        return (List<Alumno>) alumnoRepo.findAll();
    };

    public Optional<Alumno> get(Long Id) {
        return alumnoRepo.findById(Id);
    }
    public  Alumno guardar(Alumno alumno) {
        return alumnoRepo.save(alumno);
    }

    public Alumno actualizar(Alumno alumno, long id) {
        alumno.setId(id);
        return alumnoRepo.save(alumno);
    }

    public void remove(long id) {
        alumnoRepo.deleteById(id);
    }


}
