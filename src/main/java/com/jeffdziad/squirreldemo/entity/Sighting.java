package com.jeffdziad.squirreldemo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@Table(name="Sighting")
public class Sighting {

    @Id
    @Column(name="sighting_id")
    private int id;

//    @ManyToOne
//    @JoinColumn(name="sq_id")
//    private Squirrel squirrel;
    @Column(name="sq_id")
    private int squirrelId;

    @Column(name="spotter_name")
    private String spotterName;

    @ManyToOne
    @JoinColumn(name="loc_id")
    private Location location;
//    @Column(name="loc_id")
//    private int loc_id;

    @Column(name="count")
    private int count;

    @Column(name="spotted_at")
    private LocalDateTime spottedAt;

}
