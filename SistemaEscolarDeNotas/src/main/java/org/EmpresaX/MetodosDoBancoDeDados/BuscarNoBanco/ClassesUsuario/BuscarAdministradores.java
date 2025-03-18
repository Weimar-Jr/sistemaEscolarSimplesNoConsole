package org.EmpresaX.MetodosDoBancoDeDados.BuscarNoBanco.ClassesUsuario;

import org.EmpresaX.ClassesUsuarios.Administradores;
import org.EmpresaX.MetodosDoBancoDeDados.BuscarNoBanco.ModeloBuscarNoBanco;

import java.util.List;

public class BuscarAdministradores extends ModeloBuscarNoBanco <Administradores> {
public BuscarAdministradores(){super(Administradores.class);}

    @Override
    public List<Administradores> buscarSemFiltro(int primeiraPagina) {
        return super.buscarSemFiltro(primeiraPagina);
    }

    @Override
    public List<Administradores> BuscarComFiltro(String filtro, Object valor) {
        return super.BuscarComFiltro(filtro, valor);
    }
}
