package com.cjava.demo.services;

import com.cjava.demo.domain.entities.Alumno;
import com.cjava.demo.domain.entities.Curso;
import com.cjava.demo.domain.persistence.AlumnoDao;
import com.cjava.demo.domain.persistence.CursoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AlumnoServiceImpl implements AlumnoService{
    @Autowired
    private AlumnoDao dao;

    @Override
    @Transactional
    public void grabar(Alumno alumno) {
        dao.save(alumno);
    }

    @Override
    @Transactional
    public void eliminar(int id) {
        dao.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Alumno buscar(Integer id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Alumno> listar() {
        return (List<Alumno>)dao.findAll();
    }
}
