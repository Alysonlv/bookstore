package com.alv.bookstore.service;

import com.alv.bookstore.model.Book;

import java.util.List;

public interface BookStoreService {

    List<Book> getAll();
    List<Book> findBookByAuthor(final String author);
    List<Book> findBookByTitle(final String title);

}
