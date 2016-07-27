package repository.news;

import entity.DomainObject;

import java.io.File;

/**
 * Created by Kevin Khanda on 6/19/2016.
 * Interface with methods for receiving and adding data into News entity in a database.
 */

public interface NewsRepository<V extends DomainObject> {

    String getNewsName(int newsId);

    String getNewsDescription(int newsId);

    File getNewsPhoto(int newsId);

    // Need to think later about adding information into this two tables
    void addNews(V object);
}
