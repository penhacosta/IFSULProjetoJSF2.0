/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.teste;

import br.com.ifsul.modelo.Pais;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Adevaldo
 */
public class TestePrincipal {
    
    public static void main(String args[]){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoModelPU");
        EntityManager em = emf.createEntityManager();
        Pais pais = new Pais();
        pais.setNome("Argentina");
        pais.setIso("AR");
        em.getTransaction().begin();
        em.persist(pais);
        em.getTransaction().commit();
        em.close();
    }
    
}
