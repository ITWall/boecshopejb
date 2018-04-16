/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import entities.Transferstatus;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author nguye
 */
@Stateless
public class TransferstatusFacade extends AbstractFacade<Transferstatus> implements TransferstatusFacadeLocal {

    @PersistenceContext(unitName = "boecshopejb2-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TransferstatusFacade() {
        super(Transferstatus.class);
    }
    
}
