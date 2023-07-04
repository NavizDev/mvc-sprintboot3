package com.cjava.demo.controllers;

import com.cjava.demo.domain.entities.Curso;
import com.cjava.demo.services.CursoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Map;

@Controller
public class CursoController {
    @Autowired
    CursoService cursoService;

    @RequestMapping(value = "/cursos", method = RequestMethod.GET)
    public String listar(Model model){
        model.addAttribute("cursos", cursoService.listar());
        return "cursosView";
    }

    @RequestMapping(value = "/crear-curso")
    public String crear(Map<String, Object> model) {
        Curso curso = new Curso();
        model.put("curso", curso);
        return "cursoForm";
    }

    @RequestMapping(value = "/crear-curso", method = RequestMethod.POST)
    public String guardar(@Valid Curso curso, BindingResult result, Model model, SessionStatus status) {
        if(result.hasErrors()) {
            return "cursoForm";
        }

        cursoService.grabar(curso);
        status.setComplete();
        return "redirect:cursos";
    }
}
