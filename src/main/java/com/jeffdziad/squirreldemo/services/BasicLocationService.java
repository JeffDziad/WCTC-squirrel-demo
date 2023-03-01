package com.jeffdziad.squirreldemo.services;

import com.jeffdziad.squirreldemo.entity.Location;
import com.jeffdziad.squirreldemo.repo.LocationRepository;
import com.jeffdziad.squirreldemo.IService.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BasicLocationService implements LocationService {

    @Autowired
    private LocationRepository locationRepository;

    @Override
    public List<Location> getLocationList() {
        return locationRepository.findAllByOrderByCountryAscName();
    }
}
