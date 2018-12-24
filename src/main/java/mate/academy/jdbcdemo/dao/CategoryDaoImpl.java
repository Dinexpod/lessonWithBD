package mate.academy.jdbcdemo.dao;

import mate.academy.jdbcdemo.model.Book;
import mate.academy.jdbcdemo.model.Category;

import java.sql.Connection;
import java.util.Set;

public class CategoryDaoImpl extends AbstractDao implements CategoryDao {
    protected CategoryDaoImpl(Connection connection) {
        super(connection);
    }

    public void save(Category category) {

    }

    public Set<Book> findAllBooks(Long categoryId) {
        return null;
    }
}
