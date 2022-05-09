package com.example.beppeZafferano.controllers;

import com.example.beppeZafferano.model.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ingredient")
@CrossOrigin(origins = "*")
public class IngredientController {

    @Autowired
    AppetizerRepository appetizerRepository;
    @Autowired
    DessertRepository dessertRepository;
    @Autowired
    FirstRepository firstRepository;
    @Autowired
    SecondDishRepository secondDishRepository;
    @Autowired
    IngredientRepository ingredientRepository;

    public IngredientController(AppetizerRepository appetizerRepository, DessertRepository dessertRepository,
                                FirstRepository firstRepository, SecondDishRepository secondDishRepository,
                                IngredientRepository ingredientRepository) {
        this.appetizerRepository = appetizerRepository;
        this.dessertRepository = dessertRepository;
        this.firstRepository = firstRepository;
        this.secondDishRepository = secondDishRepository;
        this.ingredientRepository = ingredientRepository;
    }
}
