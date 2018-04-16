package entities;

import entities.Card;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-16T00:51:59")
@StaticMetamodel(Cartinf.class)
public class Cartinf_ { 

    public static volatile ListAttribute<Cartinf, Card> cardList;
    public static volatile SingularAttribute<Cartinf, String> bank;
    public static volatile SingularAttribute<Cartinf, Integer> id;
    public static volatile SingularAttribute<Cartinf, String> type;

}