/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import entities.Saving;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Trung Nguyen
 */
@Stateless
public class SavingFacade extends AbstractFacade<Saving> {

    @PersistenceContext(unitName = "stkv2-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SavingFacade() {
        super(Saving.class);
    }
    
}
