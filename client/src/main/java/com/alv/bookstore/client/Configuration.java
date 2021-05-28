package com.alv.bookstore.client;

import com.alv.bookstore.service.BookManagementServices;
import com.alv.bookstore.service.BookStoreService;
import com.alv.bookstore.service.impl.BookManagementServicesImpl;
import com.alv.bookstore.service.impl.BookStoreServiceImpl;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    BookManagementServices bookManagementServices() {
        return new BookManagementServicesImpl();
    }

    @Bean
    BookStoreService bookStoreService() {
        return new BookStoreServiceImpl();
    }

}
