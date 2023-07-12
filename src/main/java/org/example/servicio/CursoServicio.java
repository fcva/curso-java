package org.example.servicio;

import org.example.model.Curso;
import org.example.repositorio.CursoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CursoServicio implements InterfaceCursoServicio{
    @Autowired
    private CursoRepositorio repositorio;
    @Override
    public List<Curso> listarCursos() {
        return (List<Curso>) repositorio.findAll();
    }
    @Override
    public Curso agregarCurso(Curso curso) {
        return repositorio.save(curso);
    }
    @Override
    public Curso actualizarCurso(Curso curso) {
        return repositorio.save(curso);
    }
    @Override
    public void eliminarCurso(Long id) {
        repositorio.deleteById(id);
    }
}
