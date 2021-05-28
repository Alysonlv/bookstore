package com.alv.bookstore.client;

import com.alv.bookstore.model.Book;
import com.alv.bookstore.service.BookManagementServices;
import com.alv.bookstore.service.BookStoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookManagementController {

    private final BookManagementServices bookManagementServices;
    private final BookStoreService bookStoreService;

    public BookManagementController(BookManagementServices bookManagementServices, BookStoreService bookStoreService) {
        this.bookManagementServices = bookManagementServices;
        this.bookStoreService = bookStoreService;
    }

    @GetMapping("/books")
    List<Book> getAllBooks() {
        return bookStoreService.getAll();
    }

    @GetMapping("/books/author/{author}")
    List<Book> searchBooksByAuthor(@PathVariable final String author) {
        return bookStoreService.findBookByAuthor(author);
    }

    @GetMapping("/books/title/{title}")
    List<Book> searchBooksByTitle(@PathVariable final String title) {
        return bookStoreService.findBookByTitle(title);
    }
}
