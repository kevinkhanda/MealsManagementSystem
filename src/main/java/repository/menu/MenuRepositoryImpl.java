package repository.menu;

import entity.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;

import java.io.File;
import java.sql.Date;

/**
 * Created by Kevin Khanda on 7/24/2016.
 * Class that implements methods from interface MenuRepository
 */
public class MenuRepositoryImpl implements MenuRepository<Menu>{

    @Autowired
    protected JdbcOperations jdbcOperations;

    @Override
    public String getOrgName(Menu object) {
        return null;
    }

    @Override
    public Date getMenuDate(Menu object) {
        return null;
    }

    @Override
    public File getMenu(Menu object) {
        return null;
    }

    @Override
    public void addMenu(Menu object) {

    }
}
