/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import entities.Cartinf;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author nguye
 */
@Local
public interface CartinfFacadeLocal {

    void create(Cartinf cartinf);

    void edit(Cartinf cartinf);

    void remove(Cartinf cartinf);

    Cartinf find(Object id);

    List<Cartinf> findAll();

    List<Cartinf> findRange(int[] range);

    int count();
    
}
