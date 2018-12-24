package mate.academy.jdbcdemo;

import mate.academy.jdbcdemo.dao.UserDao;
import mate.academy.jdbcdemo.dao.UserDaoImpl;
import mate.academy.jdbcdemo.model.User;
import mate.academy.jdbcdemo.service.UserServiceImpl;

public class JdbcMain {
    public static void main(String[] argv) {
        UserDao userDao = new UserDaoImpl(ConnectionUtil.getConnection());
        UserServiceImpl userService = new UserServiceImpl(userDao);

        User jackson = userService.findByLogin("Jackson");
        System.out.println(jackson.toString());



    }
}


