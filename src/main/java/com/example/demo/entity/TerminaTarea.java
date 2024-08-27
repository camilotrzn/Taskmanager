package com.example.demo.entity;

import lombok.Getter;

@Getter
public class TerminaTarea {

    private int id;

    private boolean terminado;

    public TerminaTarea() {
    }

    public TerminaTarea(Tarea tarea) {
        this.id = tarea.getId();
        this.terminado = true;
    }
}
