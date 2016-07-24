package repository.menu;

import entity.DomainObject;

import java.io.File;
import java.sql.Date;

/**
 * Created by Kevin Khanda on 7/24/2016.
 * Interface with methods for Menu entity from a database.
 */

public interface MenuRepository<V extends DomainObject> {

    String getOrgName(V object);

    Date getMenuDate(V object);

    File getMenu(V object);

    // Need to think how to store data here
    void addMenu(V object);
}
