package com.codegym.finalexam.service;

import com.codegym.finalexam.model.Book;
import com.codegym.finalexam.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements IBookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book getById(Long id) {
        return bookRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public Book create(Book blog) {
        return bookRepository.save(blog);
    }

    @Override
    public Book update(Book blog) {
        return bookRepository.save(blog);
    }

    @Override
    public void removeById(Long id) {
        bookRepository.deleteById(id);
    }
}
