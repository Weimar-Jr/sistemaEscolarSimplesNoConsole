package org.EmpresaX.MetodosDoBancoDeDados.BuscarNoBanco.ClassesDeRegistros;

import org.EmpresaX.ClassesDeRegistros.NotasDisciplina;
import org.EmpresaX.MetodosDoBancoDeDados.BuscarNoBanco.ModeloBuscarNoBanco;

import java.util.List;

public class BuscarNotasDiciplina extends ModeloBuscarNoBanco<NotasDisciplina> {
public BuscarNotasDiciplina(){super(NotasDisciplina.class);}

    @Override
    public List<NotasDisciplina> buscarSemFiltro(int primeiraPagina) {
        return super.buscarSemFiltro(primeiraPagina);
    }

    @Override
    public List<NotasDisciplina> BuscarComFiltro(String filtro, Object valor) {
        return super.BuscarComFiltro(filtro, valor);
    }
}
