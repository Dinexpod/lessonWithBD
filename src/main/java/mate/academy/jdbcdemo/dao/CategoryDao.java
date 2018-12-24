package mate.academy.jdbcdemo.dao;

import mate.academy.jdbcdemo.molel.Book;
import mate.academy.jdbcdemo.molel.Category;

import java.util.List;
import java.util.Set;

public interface CategoryDao {
   void save(Category category);
   Set<Book> findAllBooks(Long categoryId);
}
