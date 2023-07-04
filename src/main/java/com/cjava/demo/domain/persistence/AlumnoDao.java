package com.cjava.demo.domain.persistence;


import com.cjava.demo.domain.entities.Alumno;
import org.springframework.data.repository.CrudRepository;

public interface AlumnoDao extends CrudRepository<Alumno,Integer> {
}
