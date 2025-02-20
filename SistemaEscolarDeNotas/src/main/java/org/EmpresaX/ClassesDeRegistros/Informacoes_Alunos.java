package org.EmpresaX.ClassesDeRegistros;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Informacoes_Alunos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    protected String nome;

    @Column(nullable = false, unique = true)
    protected String matricula;


    @ManyToOne
    @JoinColumn(name = "turma_id")
    private Turma turma;

    public String getNome()
    {
        return  nome;
    }
    public void setNome(String Nome)
    {
        nome = Nome;
    }

    public String getMatricula()
    {
        return matricula;
    }
    protected void setMatricula(String matricula)
    {
        this.matricula = matricula;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Informacoes_Alunos(String Nome, Turma Turma)
    {
        this.nome = Nome;
        this.turma = Turma;
        this.matricula =  UUID.randomUUID().toString();
    }
}
