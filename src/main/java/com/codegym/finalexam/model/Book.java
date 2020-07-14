package com.codegym.finalexam.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String author;

    @Column(columnDefinition = "TEXT")
    private String description;
}
