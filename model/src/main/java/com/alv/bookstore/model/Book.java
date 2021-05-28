package com.alv.bookstore.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class Book {
    private Integer id;
    private String bin;
    private String title;
    private String language;
    private BigDecimal price;
    private String currency;
    private List<String> authors;
}
