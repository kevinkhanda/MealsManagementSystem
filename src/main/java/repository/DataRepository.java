package repository;

import entity.DomainObject;

import java.io.File;
import java.util.Set;

/**
 * Created by Kevin Khanda on 6/19/2016.
 * Interface with methods for receiving data from database.
 */

public interface DataRepository<V extends DomainObject> {

    Set<String> getUserName(V object);

    Set<String> getUserEmail(V object);

    File getUserPhoto (V object);

    // Think about data structure for history of activations

    File getMenu(V object);

    // Think about data structure for news

    void addNews(V object);

    // Storing user info
}
