/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import entities.Transfermethod;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author nguye
 */
@Local
public interface TransfermethodFacadeLocal {

    void create(Transfermethod transfermethod);

    void edit(Transfermethod transfermethod);

    void remove(Transfermethod transfermethod);

    Transfermethod find(Object id);

    List<Transfermethod> findAll();

    List<Transfermethod> findRange(int[] range);

    int count();
    
}
