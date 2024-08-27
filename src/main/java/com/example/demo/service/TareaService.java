package com.example.demo.service;

import com.example.demo.entity.Tarea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.TareaRepository;

@Service
public class TareaService {

    @Autowired
    private final TareaRepository repository;

    public TareaService(TareaRepository repository) {
        this.repository = repository;
    }

    public void añadirTarea(Tarea tarea){
        repository.save(tarea);
    }
}
