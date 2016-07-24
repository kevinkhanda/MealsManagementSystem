package repository.news;

import entity.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.io.File;
import java.sql.*;

/**
 * Created by Kevin Khanda on 6/19/2016.
 * Class for implementation of interface NewsRepository.
 */
@org.springframework.stereotype.Repository("newsRepository")
public class NewsRepositoryImpl implements NewsRepository<News> {

    @Autowired
    protected JdbcOperations jdbcOperations;

    // As before, three methods for showing data and one for adding.
    @Override
    public String getNewsName(News object) {
        String result;
        SqlRowSet rowSet = jdbcOperations.queryForRowSet("SELECT name FROM news" +
                "WHERE id = ?;", object.getId());
        result = rowSet.getString("name");
        return result;
    }

    @Override
    public String getNewsDescription(News object) {
        String result;
        SqlRowSet rowSet = jdbcOperations.queryForRowSet("SELECT description FROM news" +
                "WHERE id = ?;", object.getId());
        result = rowSet.getString("description");
        return result;
    }

    // I may have problems with binary files and its decoding.
    @Override
    public File getNewsPhoto(News object) {
        File result;
        SqlRowSet rowSet = jdbcOperations.queryForRowSet("SELECT photo FROM news" +
                "WHERE id = ?;", object.getId());
        result = (File) rowSet.getObject("photo");
        return result;
    }

    @Override
    public void addNews(News object) {
        Object[] params = new Object[] {object.getId(), object.getName(), object.getDescription(),
            object.getPhoto()};
        int[] types = new int[] {Types.INTEGER, Types.VARCHAR, Types.VARCHAR, Types.BLOB};

        jdbcOperations.update("INSERT INTO news (id, name, description, photo)" +
                "VALUES (?, ?, ?, ?);", params, types);
    }
}
