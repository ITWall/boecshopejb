package entities;

import entities.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-16T00:51:59")
@StaticMetamodel(Clothes.class)
public class Clothes_ { 

    public static volatile SingularAttribute<Clothes, Product> productID;
    public static volatile SingularAttribute<Clothes, Integer> id;
    public static volatile SingularAttribute<Clothes, String> discriminator;

}