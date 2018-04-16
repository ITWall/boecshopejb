/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import entities.Billstatus;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author nguye
 */
@Local
public interface BillstatusFacadeLocal {

    void create(Billstatus billstatus);

    void edit(Billstatus billstatus);

    void remove(Billstatus billstatus);

    Billstatus find(Object id);

    List<Billstatus> findAll();

    List<Billstatus> findRange(int[] range);

    int count();
    
}
