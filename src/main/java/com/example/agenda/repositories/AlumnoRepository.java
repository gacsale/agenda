package com.example.agenda.repositories;

import com.example.agenda.models.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface AlumnoRepository extends CrudRepository<Alumno, Long> {
}
