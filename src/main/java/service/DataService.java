package service;


import java.io.File;

/**
 * Created by Kevin Khanda on 6/19/2016.
 * Interface for separating business logic and logic of DBMS
 */

public interface DataService {

    String getUserName(String login);

    String getUserEmail(String login);

    File getUserPhoto(String login);

    boolean addUser(String name, String lastName, String fatherName, String organisation,
                    String phone, String email, String login, String password, String tgAlias, int roleId);
}
