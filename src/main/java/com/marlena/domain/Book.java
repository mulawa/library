package com.marlena.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String descprition;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Author> authors;

    private String isbn;
    private Boolean isAvaible;


}
