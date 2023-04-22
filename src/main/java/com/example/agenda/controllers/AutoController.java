package com.example.agenda.controllers;

import com.example.agenda.models.Auto;
import com.example.agenda.services.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/autos")
@CrossOrigin(origins = {"http://localhost:3001", "http://localhost:3000", "http://localhost:4200"})
public class AutoController {
    @Autowired
    AutoService autoSrv;

    @GetMapping()
    public List<Auto> getAll() {
        return autoSrv.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Auto> get(@PathVariable long id) {
        return autoSrv.get(id);
    }


    @PostMapping()
    public Auto guardar(@RequestBody Auto auto) {
        return autoSrv.guardar(auto);
    }

    @PutMapping("/{id}")
    public Auto actualizar(@PathVariable long id, @RequestBody Auto auto) {
        return autoSrv.actualizar(auto, id);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable long id) {
        autoSrv.remove(id);
    }


}
