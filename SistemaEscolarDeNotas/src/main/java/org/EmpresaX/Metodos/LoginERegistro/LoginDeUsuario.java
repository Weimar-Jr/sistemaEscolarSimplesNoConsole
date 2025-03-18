package org.EmpresaX.Metodos.LoginERegistro;

import org.EmpresaX.MetodosDoBancoDeDados.ChecarLogin.PedirUsuarioESenha;
import java.util.List;

public class LoginDeUsuario {
    static List<String> usuarioESenha = PedirUsuarioESenha.perguntar();
    
}
