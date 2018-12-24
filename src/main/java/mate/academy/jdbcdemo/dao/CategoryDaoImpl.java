package mate.academy.jdbcdemo.dao;

import mate.academy.jdbcdemo.molel.Book;
import mate.academy.jdbcdemo.molel.Category;

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
