package entities;

import entities.Account;
import entities.Address;
import entities.Bill;
import entities.Card;
import entities.Fullname;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-16T00:51:59")
@StaticMetamodel(Person.class)
public class Person_ { 

    public static volatile ListAttribute<Person, Card> cardList;
    public static volatile ListAttribute<Person, Fullname> fullnameList;
    public static volatile SingularAttribute<Person, String> des;
    public static volatile SingularAttribute<Person, String> role;
    public static volatile SingularAttribute<Person, String> gender;
    public static volatile ListAttribute<Person, Address> addressList;
    public static volatile ListAttribute<Person, Bill> billList;
    public static volatile ListAttribute<Person, Account> accountList;
    public static volatile SingularAttribute<Person, String> tel;
    public static volatile SingularAttribute<Person, Integer> id;
    public static volatile SingularAttribute<Person, String> email;

}