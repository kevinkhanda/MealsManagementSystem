package repository.user;

import entity.User;
import org.junit.Test;

/**
 * Created by Kevin Khanda on 7/24/2016.
 * Test for class UserRepositoryImpl
 */
public class UserRepositoryImplTest {

    private UserRepositoryImpl userRepository = new UserRepositoryImpl();

    @Test
    public void getUserName() throws Exception {
        String login = "test";
        String name = userRepository.getUserName(login);
        System.out.println(name);
    }

    @Test
    public void getUserEmail() throws Exception {
        String login = "test";
        String email = userRepository.getUserEmail(login);
        System.out.println(email);
    }

    @Test
    public void addUser() throws Exception {
        userRepository.addUser(new User("Kevin", "Khanda", "---", "Student",
                "12345", "k.khanda@innopolis.ru", "kkhanda", "12345", "tg", null, 123));
    }
}