package org.EmpresaX.MetodosDoBancoDeDados.ChecarLogin;
import org.EmpresaX.ClassesUsuarios.Administradores;

import java.util.List;

public  class ChecarLoginAdministrador extends ModeloChecarNoBanco <Administradores> {
    public ChecarLoginAdministrador()
    {
        super(Administradores.class);
    }

    @Override
    public Administradores procurar(String usuario, String senha) {
        return super.procurar(usuario, senha);
    }
}
