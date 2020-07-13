package com.codegym.finalexam.repository;

import com.codegym.finalexam.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Long> {
}
