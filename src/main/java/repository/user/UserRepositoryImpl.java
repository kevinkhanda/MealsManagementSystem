package repository.user;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.io.File;
import java.sql.PreparedStatement;
import java.sql.Types;

/**
 * Created by Kevin Khanda on 7/24/2016.
 * This class will implement methods that will be used to show or save data into DB.
 */

@org.springframework.stereotype.Repository("userRepository")
public class UserRepositoryImpl implements UserRepository<User> {

    @Autowired
    protected JdbcOperations jdbcOperations;

    // These three consecutive methods show data from a database
    @Override
    public String getUserName(String login) {
        String result;
        SqlRowSet rowSet = jdbcOperations.queryForRowSet("SELECT name, last_name" +
            "FROM users WHERE login = ?;", login, Types.VARCHAR);
        result = rowSet.getString("last_name") + " " + rowSet.getString("name");
        return result;
    }

    @Override
    public String getUserEmail(String login) {
        String result;
        SqlRowSet rowSet = jdbcOperations.queryForRowSet("SELECT email FROM users" +
            "WHERE login = ?;", login, Types.VARCHAR);
        result = rowSet.getString("email");
        return result;
    }

    @Override
    public File getUserPhoto(String login) {
        File result;
        SqlRowSet rowSet = jdbcOperations.queryForRowSet("SELECT photo FROM users" +
            "WHERE login = ?;", login, Types.VARCHAR);
        result = (File) rowSet.getObject("photo");
        return result;
    }

    // This method should be separated as I think.
    @Override
    public void addUser(User object) {

        Object[] params = new Object[] {object.getRoleId(), object.getLastName(),
            object.getName(), object.getFatherName(), object.getOrganisation(), object.getPhone(),
            object.getEmail(), object.getLogin(), object.getPassword(), object.getTgAlias(),
            object.getPhoto()};

        int[] types = new int[] {Types.INTEGER, Types.VARCHAR, Types.VARCHAR,
            Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.VARCHAR,
        Types.VARCHAR, Types.VARCHAR, Types.BLOB}; // only blob type supported

        jdbcOperations.update("INSERT INTO users (role, last_name, name, father_name, " +
                "organisation, phone, email, login, password, tg_alias, user_photo)" +
                "VALUES ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?;", params, types);
    }

    // Also here should be a method to show meal type

    // And one method to show telegram info
}
