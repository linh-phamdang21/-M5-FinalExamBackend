package com.codegym.finalexam.repository;

import com.codegym.finalexam.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
