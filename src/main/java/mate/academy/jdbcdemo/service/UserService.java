package mate.academy.jdbcdemo.service;

import mate.academy.jdbcdemo.molel.User;

public interface UserService {
    User findByLogin(String login);
}
