package com.jeffdziad.squirreldemo.repo;

import com.jeffdziad.squirreldemo.entity.Sighting;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SightingRepository extends CrudRepository<Sighting, Integer> {
    List<Sighting> findAllBySquirrelIdOrderBySpottedAt(int squirrelId);
}
