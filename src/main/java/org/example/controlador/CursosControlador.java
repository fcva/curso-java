package org.example.controlador;

import org.example.model.Curso;
import org.example.servicio.CursoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CursosControlador {
    @Autowired
    private CursoServicio servicio;

    @GetMapping("/cursos/index")
    public String index(Model model) {

        model.addAttribute("cursos", servicio.listarCursos());

        return "curso/index";
    }

    @GetMapping("/cursos/create")
    public String create(Model model) {

        Curso curso = new Curso();
        model.addAttribute("curso", curso);

        return "curso/create";
    }

    @PostMapping("/cursos/store")
    public String store(@ModelAttribute("curso") Curso curso) {

        servicio.agregarCurso(curso);

        return "redirect:/cursos/index";
    }
}
