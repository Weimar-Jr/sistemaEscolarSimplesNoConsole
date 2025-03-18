package org.EmpresaX.MetodosDoBancoDeDados.ChecarLogin;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.EmpresaX.MetodosDoBancoDeDados.GerenciadorDeConexao;


public abstract class ModeloChecarNoBanco<T> {

    private final Class<T> entidadeClasse;

    public ModeloChecarNoBanco(Class<T> entidadeClasse)
    {
        this.entidadeClasse = entidadeClasse;
    }
    public T procurar(String usuario, String senha)
    {


        try(EntityManager em = GerenciadorDeConexao.getInstance())
        {

            String sql = "select a from " + entidadeClasse.getSimpleName() + " a where a.usuario = :valor1, and a.senha = :valor2 ";
            TypedQuery<T> query = em.createQuery(sql, entidadeClasse);
            query.setParameter("valor1", usuario);
            query.setParameter("valor2", senha);
            return query.getSingleResult();

        }catch (Exception e)
        {
            return null;
        }
    }
}
