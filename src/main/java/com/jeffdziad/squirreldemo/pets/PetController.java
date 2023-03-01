package com.jeffdziad.squirreldemo.pets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PetController {

    @Autowired
    private PetRepository petRepository;

    @GetMapping("/")
    @ResponseBody
    public String showPets() {
        List<Pet> list = new ArrayList<>();
        Iterable<Pet> pets = petRepository.findAll();
        pets.forEach(list::add);
        return list.toString();
    }

}
