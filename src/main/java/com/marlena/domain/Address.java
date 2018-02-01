package com.marlena.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "addresses")
public class Address {

    @Id
    private Long id;

    private String street;

    @Column(name = "house_number")
    private String houseNumber;

    @Column(name = "flat_Number")
    private String flatNumber;

    @Column(name = "postal_code")
    private String postalCode;

    private String city;

    Address(){}
}
