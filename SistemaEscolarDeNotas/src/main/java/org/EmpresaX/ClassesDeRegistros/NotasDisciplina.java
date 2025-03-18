package org.EmpresaX.ClassesDeRegistros;

import jakarta.persistence.*;

@Entity
public class NotasDisciplina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String disciplina;
    @Column(nullable = false)
    private String matricula;
    @Column
    private int bimestre;
    @Column
    private float notaProvaMensal;
    @Column
    private float notaProvaBimestral;
    @Column
    private float notaTarefas = 0;
    @Column
    private float notaTrabalhos = 0;

    @ManyToOne
    @JoinColumn(name = "aluno_id", nullable = false)
    private Informacoes_Alunos aluno;

    public int getBimestre()
    {
        return bimestre;
    }
    public void setBimestre(int Bimestre)
    {
        this.bimestre = Bimestre;
    }

    public float getNotaProvaMensal()
    {
        return notaProvaMensal;
    }
    public void setNotaProvaMensal(float Nota)
    {
        this.notaProvaMensal = Nota;
    }

    public float getNotaProvaBimestral()
    {
        return notaProvaBimestral;
    }
    public void setNotaProvaBimestral(float Nota)
    {
        this.notaProvaBimestral = Nota;
    }

    public float getNotaTarefas()
    {
        return notaTarefas;
    }
    public void adicionarNotaTarefa( float nota)
    {
        this.notaTarefas = notaTarefas + nota;
    }

    public float getNotaTrabalhos()
    {
        return  notaTrabalhos;
    }
    public void adicionarNotaTrabalho(float nota)
    {
        this.notaTrabalhos = notaTrabalhos + nota;
    }

    public String getMatricula()
    {
        return  matricula;
    }

    public String getDiciplina()
    {
        return disciplina;
    }
    public NotasDisciplina() {}
    public NotasDisciplina(String disciplina, String matricula)
    {
        this.disciplina = disciplina;
        this.matricula = matricula;
    }
}
