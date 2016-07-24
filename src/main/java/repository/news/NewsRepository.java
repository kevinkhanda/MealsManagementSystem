package repository.news;

import entity.DomainObject;

import java.io.File;

/**
 * Created by Kevin Khanda on 6/19/2016.
 * Interface with methods for receiving and adding data into News entity in a database.
 */

public interface NewsRepository<V extends DomainObject> {

    String getNewsName(V object);

    String getNewsDescription(V object);

    File getNewsPhoto(V object);

    // Need to think later about adding information into this two tables
    void addNews(V object);
}
