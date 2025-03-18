package org.EmpresaX.MetodosDoBancoDeDados.BuscarNoBanco.ClassesDeRegistros;

import org.EmpresaX.ClassesDeRegistros.Informacoes_Alunos;
import org.EmpresaX.MetodosDoBancoDeDados.BuscarNoBanco.ModeloBuscarNoBanco;

import java.util.List;

public class BuscarInformacoesAlunos extends ModeloBuscarNoBanco <Informacoes_Alunos> {
    public BuscarInformacoesAlunos() {
        super(Informacoes_Alunos.class);
    }

    @Override
    public List<Informacoes_Alunos> buscarSemFiltro(int primeiraPagina) {
        return super.buscarSemFiltro(primeiraPagina);
    }

    @Override
    public List<Informacoes_Alunos> BuscarComFiltro(String filtro, Object valor) {
        return super.BuscarComFiltro(filtro, valor);
    }
}
