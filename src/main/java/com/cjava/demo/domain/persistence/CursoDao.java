package com.cjava.demo.domain.persistence;


import com.cjava.demo.domain.entities.Curso;
import org.springframework.data.repository.CrudRepository;

public interface CursoDao extends CrudRepository<Curso,Integer> {
}
