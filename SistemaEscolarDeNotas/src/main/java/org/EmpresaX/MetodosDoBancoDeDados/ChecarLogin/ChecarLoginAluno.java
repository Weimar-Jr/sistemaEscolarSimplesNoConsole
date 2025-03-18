package org.EmpresaX.MetodosDoBancoDeDados.ChecarLogin;

import org.EmpresaX.ClassesUsuarios.Alunos;

public class ChecarLoginAluno extends ModeloChecarNoBanco <Alunos> {
    public ChecarLoginAluno()
    {
        super(Alunos.class);
    }

    @Override
    public Alunos procurar(String usuario, String senha) {
        return super.procurar(usuario, senha);
    }
}
