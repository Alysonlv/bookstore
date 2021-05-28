package com.alv.bookstore.service.impl;

import com.alv.bookstore.model.Book;
import com.alv.bookstore.repository.BookManagementDAO;
import com.alv.bookstore.repository.impl.BookManagementDAOImpl;
import com.alv.bookstore.service.BookStoreService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookStoreServiceImpl implements BookStoreService {

    private static BookManagementDAO bookManagementDAO;

    public BookStoreServiceImpl() {
        if (bookManagementDAO == null) {
            bookManagementDAO = new BookManagementDAOImpl();
        }
    }

    @Override
    public List<Book> getAll() {
        return bookManagementDAO.getAll();
    }

    @Override
    public List<Book> findBookByAuthor(String author) {
        return bookManagementDAO.findBookByAuthor(author);
    }

    @Override
    public List<Book> findBookByTitle(String title) {
        return bookManagementDAO.findBookByTitle(title);
    }
}
