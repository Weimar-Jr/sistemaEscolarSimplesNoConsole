package org.EmpresaX.ClassesUsuarios;

import jakarta.persistence.*;
import org.EmpresaX.ClassesDeRegistros.Turma;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Professor extends Administradores {
   @Column(nullable = false)
    private String materia;


    @ManyToMany
    @JoinTable(
            name = "professor_turma",
            joinColumns = @JoinColumn(name = "professor_id"),
            inverseJoinColumns = @JoinColumn(name = "turma_id")
    )
    private Set<Turma> turmas = new HashSet<>();


    public Set<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(Set<Turma> turmas) {
        this.turmas = turmas;
    }

    public Professor(String Nome, String Cpf, String Usuario, String Senha, String Materia)
    {
        super(Nome,Cpf,Usuario,Senha);
        this.materia = Materia;
        this.permissao = "editarNotas";
    }
}
