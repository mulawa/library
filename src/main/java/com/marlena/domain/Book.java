package com.marlena.domain;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String descprition;
    private String isbn;

    @OneToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;

    Book(){}

}
