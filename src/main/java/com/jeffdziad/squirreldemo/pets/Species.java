package com.jeffdziad.squirreldemo.pets;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Species {

    @Id
    @Column(name="species_id")
    private int id;

    @Column(name="name")
    private String name;
}
