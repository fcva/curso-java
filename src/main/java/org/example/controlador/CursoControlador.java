package org.example.controlador;

import org.example.model.Curso;
import org.example.servicio.CursoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/cursos")
public class CursoControlador {
    @Autowired
    private CursoServicio servicio;
    @GetMapping
    public List<Curso> index() {
        return servicio.listarCursos();
    }
    @PostMapping
    public Curso store(@RequestBody Curso curso) {
        return servicio.agregarCurso(curso);
    }
    @PutMapping("/{id}")
    public Curso update(@PathVariable("id") Long id, @RequestBody Curso curso) {

        Curso c = new Curso();
        c.setId(id);
        c.setNombre(curso.getNombre());
        c.setCredito(curso.getCredito());

        return  servicio.actualizarCurso(c);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        servicio.eliminarCurso(id);
    }
}
