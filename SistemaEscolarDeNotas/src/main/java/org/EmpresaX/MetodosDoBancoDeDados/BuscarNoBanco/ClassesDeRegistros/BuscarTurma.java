package org.EmpresaX.MetodosDoBancoDeDados.BuscarNoBanco.ClassesDeRegistros;

import org.EmpresaX.MetodosDoBancoDeDados.BuscarNoBanco.ModeloBuscarNoBanco;
import  org.EmpresaX.ClassesDeRegistros.Turma;

import java.util.List;

public class BuscarTurma extends ModeloBuscarNoBanco <Turma> {
    public BuscarTurma(){super(Turma.class);}

    @Override
    public List<Turma> BuscarComFiltro(String filtro, Object valor) {
        return super.BuscarComFiltro(filtro, valor);
    }

    @Override
    public List<Turma> buscarSemFiltro(int primeiraPagina) {
        return super.buscarSemFiltro(primeiraPagina);
    }
}
