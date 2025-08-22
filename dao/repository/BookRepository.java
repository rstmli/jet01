package com.nacademy.demmmmmmmm.dao.repository;

import com.nacademy.demmmmmmmm.dao.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookRepository extends JpaRepository<BookEntity,Long> {
}
