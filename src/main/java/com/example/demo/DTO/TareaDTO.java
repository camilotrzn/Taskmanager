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

    public TareaDTO(Tarea tarea){
        this.materia= tarea.getMateria();
        this.fecha= tarea.getFechaentrega();
    }

    public TareaDTO(String materia, Date fecha){
        this.materia=materia;
        this.fecha=fecha;
    }
}
