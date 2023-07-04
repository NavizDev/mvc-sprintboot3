package com.cjava.demo.controllers;

import com.cjava.demo.services.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AlumnoController {
    @Autowired
    AlumnoService alumnoService;

    @RequestMapping(value = "/alumnos", method = RequestMethod.GET)
    public String listarAlumnos(Model model){
        model.addAttribute("alumnos", alumnoService.listar());
        return "alumnosView";
    }

}
