package com.codegym.finalexam.controller;

import com.codegym.finalexam.model.Blog;
import com.codegym.finalexam.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/blogs")
public class BlogRestController {

    @Autowired
    private IBlogService blogService;

    @GetMapping
    public ResponseEntity<List<Blog>> getAll(){
        return ResponseEntity.ok(this.blogService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Blog> getById(@PathVariable Long id){
        try {
            return ResponseEntity.ok(this.blogService.getById(id));
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Blog> createBlog(@RequestBody Blog blog){
        return ResponseEntity.ok(this.blogService.create(blog));
    }

    @PutMapping
    public ResponseEntity<Blog> updateBlog(@RequestBody Blog blog){
        return ResponseEntity.ok(this.blogService.update(blog));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removeBlog(@PathVariable Long id){
        this.blogService.removeById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
