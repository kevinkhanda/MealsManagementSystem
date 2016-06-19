package service;

import java.util.Set;

/**
 * Created by Kevin Khanda on 6/19/2016.
 * Interface for separating business logic and login of DBMS
 */

public interface DataService {

    boolean persist(String problem);

    Set<String> getRandomData();
}
