package entities;

import entities.Bill;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-16T00:51:59")
@StaticMetamodel(Transferstatus.class)
public class Transferstatus_ { 

    public static volatile SingularAttribute<Transferstatus, Bill> billID;
    public static volatile SingularAttribute<Transferstatus, Integer> id;
    public static volatile SingularAttribute<Transferstatus, Integer> time;
    public static volatile SingularAttribute<Transferstatus, String> status;

}