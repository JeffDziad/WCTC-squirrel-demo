package com.jeffdziad.squirreldemo.repo;

import com.jeffdziad.squirreldemo.entity.Location;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LocationRepository extends CrudRepository<Location, Integer> {
    List<Location> findAllByOrderByCountryAscName();
}
