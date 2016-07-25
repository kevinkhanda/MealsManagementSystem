package service;

import entity.Data;
import entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import repository.menu.MenuRepositoryImpl;
import repository.news.NewsRepositoryImpl;
import repository.user.UserRepositoryImpl;

import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Kevin Khanda on 6/19/2016.
 * Class that implements DataService that separate business logic of application with DBMS logic.
 */
@Service("dataService")
public class DataServiceImpl implements DataService {

    private static final Logger log = LoggerFactory.getLogger(DataServiceImpl.class);

    private AtomicInteger integer = new AtomicInteger(Integer.MIN_VALUE);

    @Autowired
    @Qualifier("userRepository")
    private UserRepositoryImpl userRepository;

    @Autowired
    @Qualifier("newsRepository")
    private NewsRepositoryImpl newsRepository;

    @Autowired
    @Qualifier("menuRepository")
    private MenuRepositoryImpl menuRepository;

    @Override
    public String getUserName(String login) {
        try {
            log.info("User name returned successfully!");
            return userRepository.getUserName(login);
        } catch (Exception e) {
            log.error("Error with extracting user name: " + e.getMessage(), e);
            return "Error with extracting user name: no such login registered.";
        }
    }

    @Override
    public String getUserEmail(String login) {
        try {
            log.info("User email returned successfully!");
            return userRepository.getUserEmail(login);
        } catch (Exception e) {
            log.error("Error with extracting user email: " + e.getMessage(), e);
            return "Error with extracting user name: no such login registered.";
        }
    }

    public File getUserPhoto(String login) {
        try {
            log.info("User photo returned successfully!");
            return userRepository.getUserPhoto(login);
        } catch (Exception e) {
            log.error("Error with extracting user photo: " + e.getMessage(), e);
            return null;
        }
    }

    @Override
    public boolean addUser(String name, String lastName, String fatherName, String organisation,
                           String phone, String email, String login, String password, String tgAlias, int roleId) {
        try {
            userRepository.addUser(new User(integer.incrementAndGet(), name, lastName, fatherName, organisation, phone,
                        email, login, password, tgAlias, roleId));
            log.info("User " + name + " " + lastName + " added successfully!");
            return true;
        } catch (Exception e) {
            log.error("Error with adding user " + name + " " + lastName + ". Exception: " + e.getMessage(), e);
            return false;
        }
    }

    /*@Override
    public boolean persist(String problem) {
        try {
            dataRepository.persist(new Data(UUID.randomUUID(), problem));
            return true;
        } catch (Exception e) {
            log.error("ERROR SAVING DATA: " + e.getMessage(), e);
            return false;
        }
    }*/

    /*@Override
    public Set<String> getRandomData() {
        return dataRepository.getRandomData();
    }*/
}
