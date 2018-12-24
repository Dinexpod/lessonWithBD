package mate.academy.jdbcdemo.service;

import mate.academy.jdbcdemo.dao.UserDao;
import mate.academy.jdbcdemo.molel.User;

public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public User findByLogin(String login) {
        return userDao.findByLogin(login);
    }
}
