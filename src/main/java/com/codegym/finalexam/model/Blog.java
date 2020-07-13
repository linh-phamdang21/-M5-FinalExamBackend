package com.codegym.finalexam.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;

    @Column(columnDefinition = "TEXT")
    private String body;
}
