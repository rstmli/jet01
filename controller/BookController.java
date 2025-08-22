package com.nacademy.demmmmmmmm.controller;

import com.nacademy.demmmmmmmm.dto.BookDto;
import com.nacademy.demmmmmmmm.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("api/v1/book")
@RequiredArgsConstructor
public class BookController {


    private final BookService bookService;



    @PostMapping("add")
    public void addBook(@RequestBody BookDto dto){
        bookService.addBook(dto);
    }
}
