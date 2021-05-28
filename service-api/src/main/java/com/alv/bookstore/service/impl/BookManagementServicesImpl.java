package com.alv.bookstore.service.impl;

import com.alv.bookstore.model.Book;
import com.alv.bookstore.repository.BookManagementDAO;
import com.alv.bookstore.repository.impl.BookManagementDAOImpl;
import com.alv.bookstore.service.BookManagementServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookManagementServicesImpl implements BookManagementServices {

    static private BookManagementDAO bookManagementDAO;

    public BookManagementServicesImpl() {
        if (bookManagementDAO == null) {
            bookManagementDAO = new BookManagementDAOImpl();
        }
    }

    @Override
    public Book createBook(Book book) {
        return bookManagementDAO.createBook(book).get();
    }

    @Override
    public Book updateBook(Book book) throws Exception {
        Optional<Book> updatedBook = bookManagementDAO.updateBook(book);
        updatedBook.orElseThrow(() -> new Exception("Book does not exist: " + book.toString()));
        return updatedBook.get();
    }

    @Override
    public Book deleteBook(String bin) throws Exception {
        Optional<Book> deletedBook = bookManagementDAO.deleteBook(bin);
        deletedBook.orElseThrow(() -> new Exception("Book does not exist: " + bin));
        return deletedBook.get();
    }
}
