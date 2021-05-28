package com.alv.bookstore.repository;
import com.alv.bookstore.model.Book;
import com.alv.bookstore.repository.impl.BookManagementDAOImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Optional;


public class BookManagementDAOTest {

    static private BookManagementDAO bookManagementDAO;
    @BeforeAll
    static void beforeAll() {
        bookManagementDAO = new BookManagementDAOImpl();
    }

    @Test
    void createBook() {
        Book book = new Book(1, "abc123", "Lord of The Rings", "en", new BigDecimal(10.5), "USD", Arrays.asList("foo", "bar"));
        Optional<Book> created = bookManagementDAO.createBook(book);
    }
}
