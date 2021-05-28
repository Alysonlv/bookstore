package com.alv.bookstore.repository;

import com.alv.bookstore.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookManagementDAO {

    Optional<Book> createBook(final Book book);
    Optional<Book> updateBook(final Book book);
    Optional<Book> deleteBook(final String bin);

    List<Book> findBookByAuthor(final String author);
    List<Book> findBookByTitle(final String title);
    List<Book> getAll();
}
