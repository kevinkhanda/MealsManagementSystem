package repository;

import entity.DomainObject;

import java.io.File;
import java.sql.Date;
import java.util.Set;

/**
 * Created by Kevin Khanda on 6/19/2016.
 * Interface with methods for receiving data from database.
 */

public interface DataRepository<V extends DomainObject> {

    String getUserName(V object);

    String getUserEmail(V object);

    File getUserPhoto (V object);

    /* Think about data structure for history of activations
     Maybe use Map<Integer, Object> where Integer will be user id */

    String getOrgName(V object);

    Date getMenuDate(V object);

    File getMenu(V object);

    String getNewsName(V object);

    String getNewsDescription(V object);

    File getNewsPhoto(V object);

    // Need to think later about adding information into this two tables
    void addNews(V object);

    void addMenu(V object);

    // User will have a lot of different fields, so I should think also about adding it

    void addUser(V object);

    // Storing user info

    // Here should be method for sending Ajax-response with Meal types of users.
}
