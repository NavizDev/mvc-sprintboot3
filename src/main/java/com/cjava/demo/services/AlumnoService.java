package com.cjava.demo.services;

import com.cjava.demo.domain.entities.Alumno;

import java.util.List;

public interface AlumnoService {

    public void grabar(Alumno alumno);
    public void eliminar(int id);
    public Alumno buscar(Integer id);
    public List<Alumno> listar();

}
