/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import entities.Transfermethod;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author nguye
 */
@Stateless
public class TransfermethodFacade extends AbstractFacade<Transfermethod> implements TransfermethodFacadeLocal {

    @PersistenceContext(unitName = "boecshopejb2-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TransfermethodFacade() {
        super(Transfermethod.class);
    }
    
}
