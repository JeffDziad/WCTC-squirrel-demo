package com.jeffdziad.squirreldemo.services;

import com.jeffdziad.squirreldemo.IService.SquirrelService;
import com.jeffdziad.squirreldemo.entity.Squirrel;
import com.jeffdziad.squirreldemo.repo.SquirrelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BasicSquirrelService implements SquirrelService {

    @Autowired
    private SquirrelRepository squirrelRepository;

    @Override
    public Squirrel getSquirrel(int squirrelId) {
        Optional<Squirrel> squirrel = squirrelRepository.findById(squirrelId);
        return squirrel.orElse(new Squirrel());
    }

    @Override
    public List<Squirrel> getSquirrelList() {
        List<Squirrel> out = new ArrayList<>();
        squirrelRepository.findAll().forEach(out::add);
        return out;
    }
}
