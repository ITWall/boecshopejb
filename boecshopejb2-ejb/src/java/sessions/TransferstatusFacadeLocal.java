/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import entities.Transferstatus;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author nguye
 */
@Local
public interface TransferstatusFacadeLocal {

    void create(Transferstatus transferstatus);

    void edit(Transferstatus transferstatus);

    void remove(Transferstatus transferstatus);

    Transferstatus find(Object id);

    List<Transferstatus> findAll();

    List<Transferstatus> findRange(int[] range);

    int count();
    
}
