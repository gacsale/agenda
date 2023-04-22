package com.example.agenda.services;

import com.example.agenda.models.Auto;
import com.example.agenda.repositories.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutoService {

    @Autowired
    AutoRepository autoRepo;

    public List<Auto> getAll() {
        return (List<Auto>) autoRepo.findAll();
    };

    public Optional<Auto> get(Long Id) {
        return autoRepo.findById(Id);
    }
    public  Auto guardar(Auto auto) {
        return autoRepo.save(auto);
    }

    public Auto actualizar(Auto auto, long id) {
        auto.setId(id);
        return autoRepo.save(auto);
    }

    public void remove(long id) {
        autoRepo.deleteById(id);
    }


}
