package repository.news;

import config.JpaConfig;
import entity.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
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
    protected JpaConfig jpaConfig = new JpaConfig();

    @Autowired
    protected JdbcTemplate jdbcTemplate = new JdbcTemplate(jpaConfig.configureDataSource());

    // As before, three methods for showing data and one for adding.
    @Override
    public String getNewsName(int newsId) {
        String result = "";
        SqlRowSet rowSet = jdbcTemplate.queryForRowSet("SELECT header FROM news" +
                " WHERE id = ?;", newsId);
        while (rowSet.next()) {
            result = rowSet.getString("header");
        }
        return result;
    }

    @Override
    public String getNewsDescription(int newsId) {
        String result = "";
        SqlRowSet rowSet = jdbcTemplate.queryForRowSet("SELECT content FROM news" +
                " WHERE id = ?;", newsId);
        while (rowSet.next()) {
            result = rowSet.getString("content");
        }
        return result;
    }

    // I may have problems with binary files and its decoding.
    @Override
    public File getNewsPhoto(int newsId) {
        File result = null;
        SqlRowSet rowSet = jdbcTemplate.queryForRowSet("SELECT photo FROM news" +
                " WHERE id = ?;", newsId);
        while (rowSet.next()) {
            result = (File) rowSet.getObject("photo");
        }
        return result;
    }

    @Override
    public Date getNewsDate(int newsId) {
        Date result = null;
        SqlRowSet rowSet = jdbcTemplate.queryForRowSet("SELECT date FROM news" +
                " WHERE id = ?;", newsId);
        while (rowSet.next()) {
            result = rowSet.getDate("date");
        }
        return result;
    }

    @Override
    public void addNews(News object) {
        Object[] params = new Object[] {object.getName(), object.getDescription(),
            object.getPhoto(), object.getDate()};
        int[] types = new int[] {Types.VARCHAR, Types.VARCHAR,
                Types.BLOB, Types.DATE};

        jdbcTemplate.update("INSERT INTO news (header, content, photo, date)" +
                "VALUES (?, ?, ?, ?);", params, types);
    }
}
