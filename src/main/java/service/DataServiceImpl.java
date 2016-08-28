package service;

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
import repository.quota.QuotaRepositoryImpl;
import repository.user.UserRepositoryImpl;

import java.io.File;
import java.sql.Date;

/**
 * Created by Kevin Khanda on 6/19/2016.
 * Class that implements DataService that separate business logic of application with DBMS logic.
 */
@Service("dataService")
public class DataServiceImpl implements DataService {

    private static final Logger log = LoggerFactory.getLogger(DataServiceImpl.class);

    @Autowired
    @Qualifier("userRepository")
    private UserRepositoryImpl userRepository = new UserRepositoryImpl();

    @Autowired
    @Qualifier("newsRepository")
    private NewsRepositoryImpl newsRepository = new NewsRepositoryImpl();

    @Autowired
    @Qualifier("menuRepository")
    private MenuRepositoryImpl menuRepository = new MenuRepositoryImpl();

    @Autowired
    @Qualifier("quotaRepository")
    private QuotaRepositoryImpl quotaRepository = new QuotaRepositoryImpl();

    @Override
    public String getUserName(String login) {
        try {
            log.info("Returning user name...");
            return userRepository.getUserName(login);
        } catch (Exception e) {
            log.error("Error with extracting user name: " + e.getMessage(), e);
            return "Error with extracting user name: no such login registered.";
        }
    }

    @Override
    public String getUserEmail(String login) {
        try {
            log.info("Returning user email...");
            return userRepository.getUserEmail(login);
        } catch (Exception e) {
            log.error("Error with extracting user email: " + e.getMessage(), e);
            return "Error with extracting user name: no such login registered.";
        }
    }

    public File getUserPhoto(String login) {
        try {
            log.info("Returning user photo...");
            return userRepository.getUserPhoto(login);
        } catch (Exception e) {
            log.error("Error with extracting user photo: " + e.getMessage(), e);
            return null;
        }
    }

    @Override
    public boolean addUser(String name, String lastName, String fatherName, String organisation,
                           String phone, String email, String login, String password, String tgAlias, File photo, int roleId) {
        try {
            userRepository.addUser(new User(name, lastName, fatherName, organisation, phone,
                        email, login, password, tgAlias, photo, roleId));
            log.info("User " + name + " " + lastName + " added successfully!");
            return true;
        } catch (Exception e) {
            log.error("Error with adding user " + name + " " + lastName + ". Exception: " + e.getMessage(), e);
            return false;
        }
    }

    @Override
    public void addTelegram(String login, String tgAlias) {
        try {
            userRepository.addTelegram(login, tgAlias);
            log.info("Telegram alias " + tgAlias + " for user " + login + "added successfully!");
        } catch (Exception e) {
            log.error("Error with adding telegram alias for user: " + login +"! Exception: " + e.getMessage());
        }
    }

    @Override
    public String getNewsName(int newsId) {
        try {
            log.info("Returning news name...");
            return newsRepository.getNewsName(newsId);
        } catch (Exception e) {
            log.error("Error with extracting news name: " + e.getMessage(), e);
            return "Error with extracting news name: no such news ID found.";
        }
    }

    @Override
    public String getNewsDescription(int newsId) {
        try {
            log.info("Returning news description...");
            return newsRepository.getNewsDescription(newsId);
        } catch (Exception e) {
            log.error("Error with extracting news description: " + e.getMessage(), e);
            return "Error with extracting news name: no such news ID found.";
        }
    }

    @Override
    public File getNewsPhoto(int newsId) {
        try {
            log.info("Returning news photo...");
            return newsRepository.getNewsPhoto(newsId);
        } catch (Exception e) {
            log.error("Error with extracting news photo: " + e.getMessage(), e);
            return null;
        }
    }

    @Override
    public Date getNewsDate(int newsId) {
        try {
            log.info("Returning news date...");
            return newsRepository.getNewsDate(newsId);
        } catch (Exception e) {
            log.error("Error with extracting news date: " + e.getMessage(), e);
            return null;
        }
    }

    @Override
    public boolean addNews(String name, String description, File photo, Date date) {
        try {
            newsRepository.addNews(new News(name,
                        description, photo, date));
            log.info("News added successfully!");
            return true;
        } catch (Exception e) {
            log.error("Error with adding news: " + e.getMessage(), e);
            return false;
        }
    }


    @Override
    public Date getMenuDate(int menuId) {
        try {
            log.info("Returning menu date...");
            return menuRepository.getMenuDate(menuId);
        } catch (Exception e) {
            log.error("Error with extracting menu date: " + e.getMessage(), e);
            return null;
        }
    }

    @Override
    public File getMenu(int menuId) {
        try {
            log.info("Returning menu...");
            return menuRepository.getMenu(menuId);
        } catch (Exception e) {
            log.error("Error with extracting menu: " + e.getMessage(), e);
            return null;
        }
    }

    @Override
    public boolean addMenu(Date date, File menu) {
        try {
            menuRepository.addMenu(new Menu(date, menu));
            log.info("Menu added successfully!");
            return true;
        } catch (Exception e) {
            log.error("Error with adding menu: " + e.getMessage(), e);
            return false;
        }
    }

    /**
     * Method that will update existing rows with given parameters
     * @param login of user that changes meal type
     * @param mealTypeID 1, 2, 3, 4 or 5.
     *                   for more info check quotaRepository methods
     * @param quantity
     * @param isWorkday
     * @param isWeekend
     */
    @Override
    public void quotaForNextMonth(String login, int mealTypeID, int quantity, boolean isWorkday, boolean isWeekend) {
        try {
            quotaRepository.quotaForNextMonth(login, mealTypeID, quantity,
                    isWorkday, isWeekend);
            log.info("Meal plan for user " + login + " added successfully.");
        } catch (Exception e) {
            log.error(e.getMessage());
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
