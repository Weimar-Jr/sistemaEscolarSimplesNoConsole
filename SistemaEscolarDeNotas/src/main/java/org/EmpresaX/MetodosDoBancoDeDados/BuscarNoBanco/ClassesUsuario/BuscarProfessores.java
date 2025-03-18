package org.EmpresaX.MetodosDoBancoDeDados.BuscarNoBanco.ClassesUsuario;

import org.EmpresaX.ClassesUsuarios.Professores;
import org.EmpresaX.MetodosDoBancoDeDados.BuscarNoBanco.ModeloBuscarNoBanco;

import java.util.List;

public class BuscarProfessores extends ModeloBuscarNoBanco <Professores> {
    public BuscarProfessores(){super(Professores.class);}

    @Override
    public List<Professores> buscarSemFiltro(int primeiraPagina) {
        return super.buscarSemFiltro(primeiraPagina);
    }

    @Override
    public List<Professores> BuscarComFiltro(String filtro, Object valor) {
        return super.BuscarComFiltro(filtro, valor);
    }
}
