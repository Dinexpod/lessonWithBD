package mate.academy.jdbcdemo.service;

import mate.academy.jdbcdemo.model.User;

public interface UserService {
    User findByLogin(String login);
}
