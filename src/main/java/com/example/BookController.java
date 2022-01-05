package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import java.util.List;

/**
 *
 * @author sseighma
 */

@Controller("/books")
 public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @Get
    List<String> list() {
        return bookService.listTitles();
    }
}
