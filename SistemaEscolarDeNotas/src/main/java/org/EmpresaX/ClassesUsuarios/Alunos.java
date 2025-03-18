package org.EmpresaX.ClassesUsuarios;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import org.EmpresaX.ClassesDeRegistros.Informacoes_Alunos;

@Entity
public class Alunos extends Informacoes_Alunos {
   @Column(nullable = false, unique = true)
    private String usuario;
   @Column(nullable = false)
    private String senha;
   @Column(nullable = false)
   private String permissao;


   public String getUsuario()
   {
       return usuario;
   }
   public void setUsuario(String novoUsuario)
   {
       usuario = novoUsuario;
   }

   public void setSenha( String novaSenha)
   {
       senha = novaSenha;
   }

    public Alunos(Informacoes_Alunos aluno , String usuario, String senha)
    {
        super(aluno.getNome(), aluno.getTurma());
        this.usuario = usuario;
        this.senha = senha;
        this.matricula = aluno.getMatricula();
        this.permissao = "ver notas";
    }
}
