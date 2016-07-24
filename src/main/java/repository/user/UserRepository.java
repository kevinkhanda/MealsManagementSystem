package repository.user;

import entity.DomainObject;

import java.io.File;

/**
 * Created by Kevin Khanda on 7/24/2016.
 * Interface with methods for operations with Users entitry in a database
 */

public interface UserRepository<V extends DomainObject> {

    String getUserName(V object);

    String getUserEmail(V object);

    File getUserPhoto (V object);

    /* Think about data structure for history of activations
     Maybe use Map<Integer, Object> where Integer will be user id */

    // User will have a lot of different fields, so I should think also about adding it

    void addUser(V object);

    // Here should be method for sending Ajax-response with Meal types of users.
}
