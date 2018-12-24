package mate.academy.jdbcdemo.dao;

import mate.academy.jdbcdemo.model.User;

public interface UserDao {
    User findByLogin(String login);
}
