package repository.menu;

import entity.DomainObject;

import java.io.File;
import java.sql.Date;

/**
 * Created by Kevin Khanda on 7/24/2016.
 * Interface with methods for Menu entity from a database.
 */

public interface MenuRepository<V extends DomainObject> {

    Date getMenuDate(int menuId);

    File getMenu(int menuId);

    // Need to think how to store data here
    void addMenu(V object);
}
