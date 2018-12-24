package mate.academy.jdbcdemo.dao;

import mate.academy.jdbcdemo.molel.User;

public interface UserDao {
    User findByLogin(String login);
}
