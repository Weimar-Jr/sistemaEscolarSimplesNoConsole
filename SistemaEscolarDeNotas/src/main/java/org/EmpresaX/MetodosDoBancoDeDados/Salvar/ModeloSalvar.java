package org.EmpresaX.MetodosDoBancoDeDados.Salvar;

import jakarta.persistence.EntityManager;
import org.EmpresaX.MetodosDoBancoDeDados.GerenciadorDeConexao;

public  abstract class ModeloSalvar<A> {
    public void salvar( A entidade)
    {
        EntityManager entity = GerenciadorDeConexao.getInstance();
        try
        {
            entity.getTransaction().begin();
            entity.persist(entidade);
            entity.getTransaction().commit();

        }catch (Exception e )
        {
            e.printStackTrace();
            entity.getTransaction().rollback();
        }finally {
            entity.close();
        }
    }
}
