package org.example;

import org.example.model.Curso;
import org.example.repositorio.CursoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    private CursoRepositorio repositorio;
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        /*Curso curso1 = new Curso("Fundamentos de Redes", "4");
        repositorio.save(curso1);
        Curso curso2 = new Curso("Ciencia de Datos", "4");
        repositorio.save(curso2);*/
    }
}
