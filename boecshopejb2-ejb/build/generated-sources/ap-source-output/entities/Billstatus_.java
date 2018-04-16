package entities;

import entities.Bill;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-16T00:51:59")
@StaticMetamodel(Billstatus.class)
public class Billstatus_ { 

    public static volatile ListAttribute<Billstatus, Bill> billList;
    public static volatile SingularAttribute<Billstatus, Integer> id;
    public static volatile SingularAttribute<Billstatus, String> status;

}