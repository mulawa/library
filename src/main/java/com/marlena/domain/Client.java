package com.marlena.domain;

import javax.persistence.*;

@Entity
@Table(name = "clients")
public class Client {

    @Id
    private Long id;

    private String firstName;

    private String lastName;

    @OneToOne()
    @JoinColumn(name = "address_id")
    private Address address;

    Client(){}
}
