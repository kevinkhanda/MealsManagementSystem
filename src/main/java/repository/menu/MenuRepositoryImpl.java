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
public class MenuRepositoryImpl implements MenuRepository<Menu>{

    @Autowired
    protected JdbcOperations jdbcOperations;

    @Override
    public String getOrgName(Menu object) {
        String result;
        SqlRowSet rowSet = jdbcOperations.queryForRowSet("SELECT organisation FROM menu" +
                "WHERE id = ?;", object.getId());
        result = rowSet.getString("organisation");
        return result;
    }

    @Override
    public Date getMenuDate(Menu object) {
        Date result;
        SqlRowSet rowSet = jdbcOperations.queryForRowSet("SELECT date FROM menu" +
                "WHERE id = ?;", object.getId());
        result = rowSet.getDate("date");
        return result;
    }

    @Override
    public File getMenu(Menu object) {
        File result;
        SqlRowSet rowSet = jdbcOperations.queryForRowSet("SELECT menu FROM menu" +
                "WHERE id = ?;", object.getId());
        result = (File) rowSet.getObject("menu");
        return result;
    }

    @Override
    public void addMenu(Menu object) {
        Object[] params = new Object[] {object.getId(), object.getOrganisation(),
            object.getDate(), object.getMenu()};
        int[] types = new int[] {Types.INTEGER, Types.VARCHAR, Types.DATE, Types.BLOB};
        jdbcOperations.update("INSERT INTO menu (id, organisation, date, menu)" +
                "VALUES (?, ?, ?, ?);", params, types);
    }
}
