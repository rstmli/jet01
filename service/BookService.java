package com.nacademy.demmmmmmmm.service;

import com.nacademy.demmmmmmmm.dao.entity.BookEntity;
import com.nacademy.demmmmmmmm.dao.repository.AuthRepository;
import com.nacademy.demmmmmmmm.dao.repository.BookRepository;
import com.nacademy.demmmmmmmm.dto.BookDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;
    private final AuthRepository authRepository;


    public void addBook(BookDto dto){
        var auth = authRepository.findById(dto.getAuthId()).orElseThrow(() -> new RuntimeException("not found auth"));

        var entity = BookEntity.builder().bookName(dto.getBookName())
                .bookPrice(dto.getBookPrice()).authId(auth.getId()).build();


        bookRepository.save(entity);
    }
}
