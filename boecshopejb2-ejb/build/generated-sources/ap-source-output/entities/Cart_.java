package entities;

import entities.Bill;
import entities.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-16T00:51:59")
@StaticMetamodel(Cart.class)
public class Cart_ { 

    public static volatile SingularAttribute<Cart, Integer> quantity;
    public static volatile SingularAttribute<Cart, Product> productID;
    public static volatile SingularAttribute<Cart, Bill> billID;
    public static volatile SingularAttribute<Cart, Integer> id;

}