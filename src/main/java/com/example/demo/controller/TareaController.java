package com.example.demo.controller;
import com.example.demo.entity.Tarea;
import com.example.demo.entity.TerminaTarea;
import com.example.demo.service.TareaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@RestController
public class TareaController {

    private final TareaService service;

    public TareaController(TareaService service) {
        this.service = service;
    }
    @PostMapping("/NewTask")
    public ResponseEntity<String> agregarTarea(@RequestBody Tarea tarea) {
        try {
            service.añadirTarea(tarea);
            return ResponseEntity.ok("Tarea Guardada");
        } catch (Exception e) {
            System.err.println("Error inesperado: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Ocurrió un error inesperado.");
        }
    }

    @PostMapping("/updateTask")
    public ResponseEntity<String> terminarTarea(@RequestBody TerminaTarea tarea) {
        try {
            service.terminaTarea(tarea);
            return ResponseEntity.ok("Tarea Guardada");
        } catch (Exception e) {
            System.err.println("Error inesperado: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Ocurrió un error inesperado.");
        }
    }
}
