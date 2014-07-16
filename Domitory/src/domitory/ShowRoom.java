/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domitory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Administrator
 */
public class ShowRoom {
    public static void main(String[] args) {
        EntityManagerFactory factory=Persistence.createEntityManagerFactory("DomitoryPU");
        EntityManager em=factory.createEntityManager();
        em.getTransaction().begin();
        em.close();
      
    } 
}
