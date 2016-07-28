package repository.user;

import org.junit.Test;

/**
 * Created by Kevin Khanda on 7/24/2016.
 * Test for class UserRepositoryImpl
 */
public class UserRepositoryImplTest {
    @Test
    public void getUserName() throws Exception {
        UserRepositoryImpl userRepository = new UserRepositoryImpl();
        String login = "test";
        String name = userRepository.getUserName(login);
        System.out.println(name);
    }

    @Test
    public void getUserEmail() throws Exception {
        UserRepositoryImpl userRepository = new UserRepositoryImpl();
        String login = "test";
        String email = userRepository.getUserEmail(login);
        System.out.println(email);
    }
}