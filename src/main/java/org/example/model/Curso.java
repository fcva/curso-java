package org.example.model;

import javax.persistence.*;

@Entity
@Table(name = "cursos")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = true, length = 180)
    private String nombre;

    @Column(name = "credito", nullable = true, length = 9)
    private String credito;

    public Curso() {

    }
    public Curso(Long id, String nombre, String credito) {
        this.id = id;
        this.nombre = nombre;
        this.credito = credito;
    }

    public Curso(String nombre, String credito) {
        this.nombre = nombre;
        this.credito = credito;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCredito() {
        return credito;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }
}
