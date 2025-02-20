package org.EmpresaX.ClassesDeRegistros;

import jakarta.persistence.*;
import org.EmpresaX.ClassesUsuarios.Professor;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nomeTurma;

    @ManyToMany(mappedBy = "turmas")
    private Set<Professor> professores =  new HashSet<>();

    @OneToMany(mappedBy = "turma", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Informacoes_Alunos> alunos = new HashSet<>();;

    public String getNomeTurma()
    {
        return nomeTurma;
    }

    public Set<Professor> getProfessores() {
        return professores;
    }

    public Set<Informacoes_Alunos> getAlunos() {
        return alunos;
    }

    public Turma(String nome) {
        this.nomeTurma = nome;
    }
    public Turma() {}
}
