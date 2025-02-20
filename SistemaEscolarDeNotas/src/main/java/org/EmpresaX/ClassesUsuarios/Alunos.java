package org.EmpresaX.ClassesUsuarios;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import org.EmpresaX.ClassesDeRegistros.Informacoes_Alunos;
import org.EmpresaX.ClassesDeRegistros.Turma;

@Entity
public class Alunos extends Informacoes_Alunos {
   @Column(nullable = false, unique = true)
    private String usuario;
   @Column(nullable = false)
    private String senha;
   @Column(nullable = false)
   private String permissao;


    public Alunos(String nome, Turma turma, String matricula, String usuario, String senha)
    {
        super(nome,turma);
        this.usuario = usuario;
        this.senha = senha;
        this.setMatricula( matricula);
        this.permissao = "ver notas";
    }
}
