package org.EmpresaX.MetodosDoBancoDeDados;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class GerenciadorDeConexao
{
    private static final EntityManagerFactory factory = Persistence.createEntityManagerFactory("MinhaConexao");

    public static EntityManager getInstance()
    {
        return  factory.createEntityManager();
    }

}
