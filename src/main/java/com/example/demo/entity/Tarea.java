package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Entity
@Data
@Table
@ToString
public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String materia;

    @Column
    private String descripcion;

    @Column
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss'Z'")
    private Date fechaentrega;


    public Tarea(String materia,String descripcion, Date fechaentrega){
        this.materia=materia;
        this.descripcion=descripcion;
        this.fechaentrega=fechaentrega;
    }


    public Tarea(){

    }
}
