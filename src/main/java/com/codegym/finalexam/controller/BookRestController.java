package com.codegym.finalexam.controller;

import com.codegym.finalexam.model.Book;
import com.codegym.finalexam.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/books")
public class BookRestController {

    @Autowired
    private IBookService bookService;

    @GetMapping
    public ResponseEntity<List<Book>> getAll(){
        return ResponseEntity.ok(this.bookService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getById(@PathVariable Long id){
        try {
            return ResponseEntity.ok(this.bookService.getById(id));
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book blog){
        return ResponseEntity.ok(this.bookService.create(blog));
    }

    @PutMapping
    public ResponseEntity<Book> updateBook(@RequestBody Book blog){
        return ResponseEntity.ok(this.bookService.update(blog));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removeBook(@PathVariable Long id){
        this.bookService.removeById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
