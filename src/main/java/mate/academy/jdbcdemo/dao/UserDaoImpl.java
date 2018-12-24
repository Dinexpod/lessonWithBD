package mate.academy.jdbcdemo.dao;

import mate.academy.jdbcdemo.model.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDaoImpl extends AbstractDao implements UserDao{

    public UserDaoImpl(Connection connection) {
        super(connection);
    }

    public User findByLogin(String login) {
        String sql = "SELECT * FROM users WHERE login = \"" + login + "\"";

        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            return rs.next() ? getUser(rs) : null;
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return null;
    }

    private User getUser(ResultSet rs) throws SQLException {
        User user = new User();
        user.setId(rs.getLong("user_id"));
        user.setLogin(rs.getString("login"));
        user.setPassword(rs.getString("password"));
        user.setName(rs.getString("name"));
        user.setSex(rs.getString("sex"));

        return user;
    }
}
