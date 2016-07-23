package repository;

import entity.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Kevin Khanda on 6/19/2016.
 * Class for implementation of interface DataRepository.
 */
@org.springframework.stereotype.Repository("dataRepository")
public class DataRepositoryImpl implements DataRepository<Data> {

    @Autowired
    protected JdbcOperations jdbcOperations;

    /**
     * Adding data into DataBase.
     * @param object that consists of Id and Description
     */
    @Override
    public void persist(Data object) {

        Object[] params = new Object[] {object.getId(), object.getDescription()};
        int[] types = new int[] {Types.VARCHAR, Types.VARCHAR};

        jdbcOperations.update("INSERT INTO myapp(\n" +
                "       data_id, data_description)\n" +
                "   VALUES (cast(? as UUID), ?);", params, types);
    }

    /**
     * Deletes given data from DataBase (by ID).
     * @param object just for receiving ID
     */
    @Override
    public void delete(Data object) {
        jdbcOperations.update("DELETE FROM myapp\n" +
                "WHERE data_id = '" + object.getId().toString() + "';");
    }

    @Override
    public Set<String> getRandomData() {
        Set<String> result = new HashSet<>();
        SqlRowSet rowSet = jdbcOperations.queryForRowSet("SELECT data_id, data_description" +
                "FROM myapp" +
                "WHERE data_description = 'Kevin';");
        while (rowSet.next()) {
            result.add(rowSet.getString("data_description"));
        }
        return result;
    }

    @Override
    public void update(Data object) {

    }
}
