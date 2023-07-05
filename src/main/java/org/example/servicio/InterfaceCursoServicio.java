package org.example.servicio;

import org.example.model.Curso;

import java.util.List;

public interface InterfaceCursoServicio {
    public List<Curso> listarCursos();
    public Curso agregarCurso(Curso curso);
    public Curso actualizarCurso(Curso curso);
    public void eliminarCurso(Long id);
}
