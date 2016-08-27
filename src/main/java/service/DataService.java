package service;

import java.io.File;
import java.sql.Date;

/**
 * Created by Kevin Khanda on 6/19/2016.
 * Interface for separating business logic and logic of DBMS
 */

public interface DataService {

    // User data

    String getUserName(String login);

    String getUserEmail(String login);

    File getUserPhoto(String login);

    boolean addUser(String name, String lastName, String fatherName, String organisation,
                    String phone, String email, String login, String password, String tgAlias, File photo, int roleId);

    void addTelegram(String login, String tgAlias);

    // News data

    String getNewsName(int newsId);

    String getNewsDescription(int newsId);

    File getNewsPhoto(int newsId);

    Date getNewsDate(int newsId);

    boolean addNews(String name, String description, File photo, Date date);

    // Menu data

    Date getMenuDate(int menuId);

    File getMenu(int menuId);

    boolean addMenu(Date date, File menu);
}
