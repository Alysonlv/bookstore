package com.alv.bookstore.service;

import com.alv.bookstore.model.Book;

import java.util.Optional;

public interface BookManagementServices {

    Book createBook(Book book);
    Book  updateBook(Book book) throws Exception;
    Book deleteBook(String bin) throws Exception;
}
