package repository.user;

import entity.User;
import repository.user.UserRepository;

import java.io.File;

/**
 * Created by Kevin Khanda on 7/24/2016.
 * This class will implement methods that will be used to show or save data into DB.
 */


public class UserRepositoryImpl implements UserRepository<User> {
    @Override
    public String getUserName(User object) {
        return null;
    }

    @Override
    public String getUserEmail(User object) {
        return null;
    }

    @Override
    public File getUserPhoto(User object) {
        return null;
    }

    @Override
    public void addUser(User object) {

    }
}
