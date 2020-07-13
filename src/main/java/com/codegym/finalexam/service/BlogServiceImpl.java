package com.codegym.finalexam.service;

import com.codegym.finalexam.model.Blog;
import com.codegym.finalexam.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements IBlogService{

    @Autowired
    private BlogRepository blogRepository;

    @Override
    public List<Blog> getAll() {
        return blogRepository.findAll();
    }

    @Override
    public Blog getById(Long id) {
        return blogRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public Blog create(Blog blog) {
        return blogRepository.save(blog);
    }

    @Override
    public Blog update(Blog blog) {
        return blogRepository.save(blog);
    }

    @Override
    public void removeById(Long id) {
        blogRepository.deleteById(id);
    }
}
