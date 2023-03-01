package com.jeffdziad.squirreldemo.pets;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Pet {
    @Id
    @Column(name="pet_id")
    private int id;

    @Column(name="name")
    private String name;

    @ManyToOne
    @JoinColumn(name="pet_species_id")
    private Species species;

    // private Species replaces this.
//    @Column(name="pet_species_id")
//    private int speciesId;
}
