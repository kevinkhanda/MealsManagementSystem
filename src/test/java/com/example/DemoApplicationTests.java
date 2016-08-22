package com.example;

import entity.Menu;
import entity.News;
import entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import repository.menu.MenuRepositoryImpl;
import repository.news.NewsRepositoryImpl;
import repository.user.UserRepositoryImpl;
import service.DataServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
        // Testing retrieving user information from db
        DataServiceImpl dataService = new DataServiceImpl();
        System.out.println(dataService.getUserName("k.khanda"));
        System.out.println(dataService.getUserEmail("k.khanda"));
        System.out.println(dataService.getUserPhoto("k.khanda"));

        /* Testing inserting information into a database.
           And again retrieving an info of created user. */
        UserRepositoryImpl userRepository = new UserRepositoryImpl();
        userRepository.addUser(new User("test", "test", "test", "test", null, "test",
                "test", "test", "test", null, 2));
        System.out.println(dataService.getUserName("test"));

        // Testing how database is working with news
        NewsRepositoryImpl newsRepository = new NewsRepositoryImpl();
        newsRepository.addNews(new News("Test news", "This is a news for testing", null, null));
        System.out.println(newsRepository.getNewsName(1));

        // Testing how application works with menu
        MenuRepositoryImpl menuRepository = new MenuRepositoryImpl();
        menuRepository.addMenu(new Menu(null, null));
        // Printing is not supported here because system is not configured for storing files, yet
    }
}
