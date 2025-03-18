package org.EmpresaX.MetodosDoBancoDeDados.BuscarNoBanco.ClassesUsuario;

import org.EmpresaX.ClassesUsuarios.Alunos;
import org.EmpresaX.MetodosDoBancoDeDados.BuscarNoBanco.ModeloBuscarNoBanco;

import java.util.List;

public class BuscarAlunos extends ModeloBuscarNoBanco <Alunos> {
    public BuscarAlunos(){super(Alunos.class);}

    @Override
    public List<Alunos> BuscarComFiltro(String filtro, Object valor) {
        return super.BuscarComFiltro(filtro, valor);
    }

    @Override
    public List<Alunos> buscarSemFiltro(int primeiraPagina) {
        return super.buscarSemFiltro(primeiraPagina);
    }
}
