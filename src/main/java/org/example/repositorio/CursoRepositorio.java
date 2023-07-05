package org.example.repositorio;

import org.example.model.Curso;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepositorio extends CrudRepository<Curso, Long> {
}
