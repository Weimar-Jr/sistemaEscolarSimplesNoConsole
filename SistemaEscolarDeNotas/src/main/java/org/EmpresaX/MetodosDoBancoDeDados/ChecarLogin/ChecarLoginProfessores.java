package org.EmpresaX.MetodosDoBancoDeDados.ChecarLogin;

import org.EmpresaX.ClassesUsuarios.Professores;

public class ChecarLoginProfessores extends ModeloChecarNoBanco <Professores> {
    public ChecarLoginProfessores(){
        super(Professores.class);
    }

    @Override
    public Professores procurar(String usuario, String senha) {
        return super.procurar(usuario, senha);
    }
}
