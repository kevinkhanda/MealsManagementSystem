package repository.menu;

import config.JpaConfig;
import entity.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
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
    protected JpaConfig jpaConfig = new JpaConfig();

    @Autowired
    protected JdbcTemplate jdbcTemplate = new JdbcTemplate(jpaConfig.configureDataSource());

    @Override
    public Date getMenuDate(int menuId) {
        Date result = null;
        SqlRowSet rowSet = jdbcTemplate.queryForRowSet("SELECT date FROM menu" +
                " WHERE id = ?;", menuId);
        while (rowSet.next()) {
            result = rowSet.getDate("date");
        }
        return result;
    }

    @Override
    public File getMenu(int menuId) {
        File result = null;
        SqlRowSet rowSet = jdbcTemplate.queryForRowSet("SELECT file FROM menu" +
                " WHERE id = ?;", menuId);
        while (rowSet.next()) {
            result = (File) rowSet.getObject("menu");
        }
        return result;
    }

    @Override
    public void addMenu(Menu object) {
        Object[] params = new Object[] {object.getDate(), object.getMenu()};
        int[] types = new int[] {Types.DATE, Types.BINARY};
        jdbcTemplate.update("INSERT INTO menu (date, file)" +
                "VALUES (?, ?);", params, types);
    }
}
