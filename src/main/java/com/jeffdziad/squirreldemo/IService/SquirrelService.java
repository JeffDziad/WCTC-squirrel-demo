package com.jeffdziad.squirreldemo.IService;

import com.jeffdziad.squirreldemo.entity.Squirrel;
import java.util.List;

public interface SquirrelService {

    Squirrel getSquirrel(int squirrelId);

    List<Squirrel> getSquirrelList();
}
