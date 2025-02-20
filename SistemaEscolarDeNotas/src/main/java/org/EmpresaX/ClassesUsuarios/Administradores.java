package org.EmpresaX.ClassesUsuarios;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;


@Entity
public class Administradores
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(nullable = false, unique = true)
    private String nome;

    @Column(nullable = false, unique = true)
    private String cpf;

    @Column(nullable = false, unique = true)
    private String usuario;

    @Column(nullable = false)
    private String senha;

    @Column(nullable = false)
    protected String permissao = "total";

    public String getNome()
    {
        return nome;
    }
    public void setNome(String novoNome)
    {
        this.nome = novoNome;
    }

    public String getCpf()
    {
        return cpf;
    }
    public void setCpf(String novoCpf)
    {
        this.cpf = novoCpf;
    }

    public String getUsuario()
    {
        return usuario;
    }
    public void setUsuario(String novoUsuario)
    {
        this.usuario = novoUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    public Administradores(String Nome, String Cpf, String Usuario, String Senha)
    {
        this.nome = Nome.toUpperCase();
        this.cpf = Cpf;
        this.usuario = Usuario.toUpperCase();
        this.senha = Senha;
    }
}
