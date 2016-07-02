package repository;

import entity.DomainObject;

import java.util.Set;

/**
 * Created by Kevin Khanda on 6/19/2016.
 * Interface for collecting data from DB.
 */

public interface DataRepository<V extends DomainObject> {

    void persist (V object);

    void delete (V object);

    Set<String> getRandomData();

}
