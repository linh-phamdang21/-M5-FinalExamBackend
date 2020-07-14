package com.codegym.finalexam.service;

import com.codegym.finalexam.model.Book;

import java.util.List;


public interface IBookService {
    List<Book> getAll();

    Book getById(Long id);

    Book create(Book blog);

    Book update(Book blog);

    void removeById(Long id);

}
