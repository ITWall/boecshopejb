package entities;

import entities.Billstatus;
import entities.Cart;
import entities.Person;
import entities.Transfermethod;
import entities.Transferstatus;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-16T00:51:59")
@StaticMetamodel(Bill.class)
public class Bill_ { 

    public static volatile SingularAttribute<Bill, Integer> amount;
    public static volatile SingularAttribute<Bill, Transfermethod> transferMethodID;
    public static volatile SingularAttribute<Bill, Billstatus> billStatusID;
    public static volatile SingularAttribute<Bill, Person> personID;
    public static volatile SingularAttribute<Bill, Integer> id;
    public static volatile ListAttribute<Bill, Cart> cartList;
    public static volatile SingularAttribute<Bill, Integer> payDate;
    public static volatile SingularAttribute<Bill, Integer> createDate;
    public static volatile ListAttribute<Bill, Transferstatus> transferstatusList;

}