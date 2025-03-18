package org.EmpresaX.MetodosDoBancoDeDados.ChecarLogin;

import org.EmpresaX.Metodos.ScannerDeResposta;

import java.util.ArrayList;
import java.util.List;

public class PedirUsuarioESenha {

    public static List<String> perguntar()
    {

        System.out.println("Digite o seu usuario :");
        String usuario = ScannerDeResposta.scanner.nextLine();
        if(!usuario.isBlank()) {
            System.out.println("Digite a senha: ");
            String senha = ScannerDeResposta.scanner.nextLine();
            if(!senha.isBlank())
            {
                List<String> usuarioESenha = new ArrayList<>();
                usuarioESenha.add(usuario);
                usuarioESenha.add(senha);
                return usuarioESenha;
            }else{
                System.out.println("a senha não pode estar em branco");
            }
        }else{
            System.out.println("o usuario não pode estar em branco");
        }
        return null;
    }

}
