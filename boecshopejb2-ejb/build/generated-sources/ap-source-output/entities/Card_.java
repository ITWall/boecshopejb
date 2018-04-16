package entities;

import entities.Cartinf;
import entities.Person;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-16T00:51:59")
@StaticMetamodel(Card.class)
public class Card_ { 

    public static volatile SingularAttribute<Card, String> cartPass;
    public static volatile SingularAttribute<Card, String> cartNumber;
    public static volatile SingularAttribute<Card, Cartinf> cartInfID;
    public static volatile SingularAttribute<Card, Person> personID;
    public static volatile SingularAttribute<Card, Integer> id;

}