package com.jeffdziad.squirreldemo.IService;

import com.jeffdziad.squirreldemo.entity.Sighting;
import java.util.List;

public interface SightingService {

    void saveSighting(Sighting sighting);

    List<Sighting> getSightingsForSquirrel(int squirrelId);
}
