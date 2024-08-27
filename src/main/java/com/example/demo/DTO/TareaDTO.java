package com.example.demo.DTO;

import com.example.demo.entity.Tarea;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class TareaDTO {

    private String materia;

    private Date fecha;

    private Boolean terminado;

    public TareaDTO(Tarea tarea){
        this.materia= tarea.getMateria();
        this.fecha= tarea.getFechaentrega();
        this.terminado= tarea.isTerminado();
    }

    public TareaDTO(String materia, Date fecha, Boolean termiando){
        this.materia=materia;
        this.fecha=fecha;
        this.terminado=termiando;
    }
}
