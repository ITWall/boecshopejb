package entities;

import entities.Book;
import entities.Cart;
import entities.Clothes;
import entities.Electronic;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-16T00:51:59")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile SingularAttribute<Product, String> image;
    public static volatile SingularAttribute<Product, String> keystatus;
    public static volatile SingularAttribute<Product, Integer> oldPrice;
    public static volatile SingularAttribute<Product, String> discriminator;
    public static volatile SingularAttribute<Product, Integer> price;
    public static volatile SingularAttribute<Product, String> name;
    public static volatile ListAttribute<Product, Electronic> electronicList;
    public static volatile SingularAttribute<Product, String> company;
    public static volatile SingularAttribute<Product, Integer> id;
    public static volatile ListAttribute<Product, Clothes> clothesList;
    public static volatile ListAttribute<Product, Cart> cartList;
    public static volatile SingularAttribute<Product, String> desc;
    public static volatile ListAttribute<Product, Book> bookList;

}