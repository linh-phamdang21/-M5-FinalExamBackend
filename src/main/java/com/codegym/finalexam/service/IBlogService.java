package com.codegym.finalexam.service;

import com.codegym.finalexam.model.Blog;

import java.util.List;


public interface IBlogService {
    List<Blog> getAll();

    Blog getById(Long id);

    Blog create(Blog blog);

    Blog update(Blog blog);

    void removeById(Long id);

}
