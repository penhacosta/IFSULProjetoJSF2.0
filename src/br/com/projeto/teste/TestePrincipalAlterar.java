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
public class TestePrincipalAlterar {
    
    public static void main(String args[]){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoModelPU");
        EntityManager em = emf.createEntityManager();
        Pais pais = em.find(Pais.class, 2);
        pais.setNome("Alemanha");
        pais.setIso("ALM");
        em.getTransaction().begin();
        em.merge(pais);
        em.getTransaction().commit();
        em.close();
        
    }
    
}
