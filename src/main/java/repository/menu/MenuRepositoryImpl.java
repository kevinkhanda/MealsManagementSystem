package repository.menu;

import entity.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.io.File;
import java.sql.Date;
import java.sql.Types;

/**
 * Created by Kevin Khanda on 7/24/2016.
 * Class that implements methods from interface MenuRepository
 */
@org.springframework.stereotype.Repository("menuRepository")
public class MenuRepositoryImpl implements MenuRepository<Menu>{

    @Autowired
    protected JdbcOperations jdbcOperations;

    @Override
    public Date getMenuDate(int menuId) {
        Date result;
        SqlRowSet rowSet = jdbcOperations.queryForRowSet("SELECT date FROM menu" +
                "WHERE id = ?;", menuId);
        result = rowSet.getDate("date");
        return result;
    }

    @Override
    public File getMenu(int menuId) {
        File result;
        SqlRowSet rowSet = jdbcOperations.queryForRowSet("SELECT file FROM menu" +
                "WHERE id = ?;", menuId);
        result = (File) rowSet.getObject("menu");
        return result;
    }

    @Override
    public void addMenu(Menu object) {
        Object[] params = new Object[] {object.getDate(), object.getMenu()};
        int[] types = new int[] {Types.DATE, Types.BLOB};
        jdbcOperations.update("INSERT INTO menu (date, menu)" +
                "VALUES (?, ?);", params, types);
    }
}
