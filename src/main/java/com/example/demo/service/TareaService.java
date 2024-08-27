package com.example.demo.service;

import com.example.demo.entity.Tarea;
import com.example.demo.entity.TerminaTarea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.TareaRepository;

import java.util.Optional;

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

    public void terminaTarea(TerminaTarea terminatarea) throws Exception {
        Optional<Tarea> tarea=repository.findById(terminatarea.getId());
        if (tarea.isPresent()){
            Tarea tareaAterminar = tarea.get();
            tareaAterminar.setTerminado(true);
            repository.save(tareaAterminar);
        } else {
            throw new Exception("Petición no valida, revisa datos");
        }
    }
}
