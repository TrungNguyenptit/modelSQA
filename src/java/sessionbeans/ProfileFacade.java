/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import entities.Profile;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Trung Nguyen
 */
@Stateless
public class ProfileFacade extends AbstractFacade<Profile> {

    @PersistenceContext(unitName = "stkv2-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProfileFacade() {
        super(Profile.class);
    }
    
}
