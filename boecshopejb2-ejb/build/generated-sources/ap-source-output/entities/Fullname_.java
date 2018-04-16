package entities;

import entities.Person;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-16T00:51:59")
@StaticMetamodel(Fullname.class)
public class Fullname_ { 

    public static volatile SingularAttribute<Fullname, String> firstname;
    public static volatile SingularAttribute<Fullname, Person> personID;
    public static volatile SingularAttribute<Fullname, Integer> id;
    public static volatile SingularAttribute<Fullname, String> lastname;

}