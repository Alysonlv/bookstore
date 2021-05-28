package com.alv.bookstore.repository.impl;

import com.alv.bookstore.model.Book;
import com.alv.bookstore.repository.BookManagementDAO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class BookManagementDAOImpl implements BookManagementDAO {

    private static HashMap<String, Book> books = new HashMap<>();

    @Override
    public Optional<Book> createBook(final Book book) {
        final Book newBook = books.computeIfAbsent(book.getBin(), k -> book);

        return Optional.ofNullable(newBook);
    }

    @Override
    public Optional<Book> updateBook(Book book) {
        return Optional.ofNullable(books.replace(book.getBin(), book));
    }

    @Override
    public Optional<Book> deleteBook(final String bin) {
        final Book newBook = books.remove(bin);

        return Optional.ofNullable(newBook);
    }

    @Override
    public List<Book> findBookByAuthor(String author) {
        return books.values().stream().filter(book -> book.getAuthors().contains(author)).collect(Collectors.toList());
    }

    @Override
    public List<Book> findBookByTitle(String title) {
        return books.values().stream().filter(book -> book.getTitle().equals(title)).collect(Collectors.toList());
    }

    @Override
    public List<Book> getAll() {
        return new ArrayList<>(books.values());
    }

}
