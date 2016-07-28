package service;

import entity.Data;
import entity.Menu;
import entity.News;
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
import java.sql.Date;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Kevin Khanda on 6/19/2016.
 * Class that implements DataService that separate business logic of application with DBMS logic.
 */
@Service("dataService")
public class DataServiceImpl implements DataService {

    private static final Logger log = LoggerFactory.getLogger(DataServiceImpl.class);


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
            userRepository.addUser(new User(name, lastName, fatherName, organisation, phone,
                        email, login, password, tgAlias, roleId));
            log.info("User " + name + " " + lastName + " added successfully!");
            return true;
        } catch (Exception e) {
            log.error("Error with adding user " + name + " " + lastName + ". Exception: " + e.getMessage(), e);
            return false;
        }
    }

    @Override
    public String getNewsName(int newsId) {
        try {
            log.info("News name returned successfully!");
            return newsRepository.getNewsName(newsId);
        } catch (Exception e) {
            log.error("Error with extracting news name: " + e.getMessage(), e);
            return "Error with extracting news name: no such news ID found.";
        }
    }

    @Override
    public String getNewsDescription(int newsId) {
        try {
            log.info("News description returned successfully!");
            return newsRepository.getNewsDescription(newsId);
        } catch (Exception e) {
            log.error("Error with extracting news description: " + e.getMessage(), e);
            return "Error with extracting news name: no such news ID found.";
        }
    }

    @Override
    public File getNewsPhoto(int newsId) {
        try {
            log.info("News photo returned successfully!");
            return newsRepository.getNewsPhoto(newsId);
        } catch (Exception e) {
            log.error("Error with extracting news photo: " + e.getMessage(), e);
            return null;
        }
    }

    @Override
    public boolean addNews(String name, String description, File photo) {
        try {
            newsRepository.addNews(new News(name,
                        description, photo));
            log.info("News added successfully!");
            return true;
        } catch (Exception e) {
            log.error("Error with adding news: " + e.getMessage(), e);
            return false;
        }
    }

    @Override
    public String getOrgName(int menuId) {
        try {
            log.info("Organisation name returned successfully!");
            return menuRepository.getOrgName(menuId);
        } catch (Exception e) {
            log.error("Error with extracting organisation name: " + e.getMessage(), e);
            return "Error with extracting organisation name: no such news ID found.";
        }
    }

    @Override
    public Date getMenuDate(int menuId) {
        try {
            log.info("Date returned successfully!");
            return menuRepository.getMenuDate(menuId);
        } catch (Exception e) {
            log.error("Error with extracting news name: " + e.getMessage(), e);
            return null;
        }
    }

    @Override
    public File getMenu(int menuId) {
        try {
            log.info("Menu returned successfully!");
            return menuRepository.getMenu(menuId);
        } catch (Exception e) {
            log.error("Error with extracting menu: " + e.getMessage(), e);
            return null;
        }
    }

    @Override
    public boolean addMenu(String orgName, Date date, File menu) {
        try {
            menuRepository.addMenu(new Menu(orgName,
                    date, menu));
            log.info("Menu added successfully!");
            return true;
        } catch (Exception e) {
            log.error("Error with adding menu: " + e.getMessage(), e);
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
