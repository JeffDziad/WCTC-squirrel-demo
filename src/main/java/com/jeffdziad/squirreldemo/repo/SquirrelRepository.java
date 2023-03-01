package com.jeffdziad.squirreldemo.repo;

import com.jeffdziad.squirreldemo.entity.Squirrel;
import org.springframework.data.repository.CrudRepository;

public interface SquirrelRepository extends CrudRepository<Squirrel, Integer> {
}
