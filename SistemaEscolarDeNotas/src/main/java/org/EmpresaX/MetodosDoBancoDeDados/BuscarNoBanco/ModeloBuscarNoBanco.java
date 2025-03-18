package org.EmpresaX.MetodosDoBancoDeDados.BuscarNoBanco;


import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.EmpresaX.MetodosDoBancoDeDados.GerenciadorDeConexao;

import java.util.List;

public abstract class  ModeloBuscarNoBanco <t> {

    private final Class<t> entidadeClasse;

    public ModeloBuscarNoBanco(Class<t> entidadeClasse)
    {
        this.entidadeClasse = entidadeClasse;
    }

    public List<t> BuscarComFiltro(String filtro, Object valor)
    {
        List<t> resultado;

        try( EntityManager em = GerenciadorDeConexao.getInstance()){
            String sql = "select a from " + entidadeClasse.getSimpleName() + "a where a." + filtro + " = :valor";
            TypedQuery<t> query = em.createQuery(sql, entidadeClasse);
            query.setParameter("valor", valor );
            resultado = query.getResultList();
        }
        catch ( Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }

        return resultado;
    }

    public List<t> buscarSemFiltro(int primeiraPagina)
    {
        List<t> resultado;
        try( EntityManager em = GerenciadorDeConexao.getInstance())
        {
            String sql = "select a from " + entidadeClasse.getSimpleName() + " a";
            TypedQuery<t> query = em.createQuery(sql, entidadeClasse);
            query.setFirstResult(primeiraPagina);
            query.setMaxResults(20);
            resultado = query.getResultList();
        }catch ( Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }

        return resultado;
    }
}
