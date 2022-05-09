package com.example.beppeZafferano.controllers;

import com.example.beppeZafferano.model.exceptions.RecipeNotFoundException;
import com.example.beppeZafferano.model.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/appetizer")
@CrossOrigin(origins = "*")
public class AppetizerController {

    //@Autowired
    AppetizerRepository appetizerRepository = null;
    @Autowired
    DessertRepository dessertRepository;
    @Autowired
    FirstRepository firstRepository;
    @Autowired
    SecondDishRepository secondDishRepository;
    @Autowired
    IngredientRepository ingredientRepository;

    public AppetizerController(AppetizerRepository appetizerRepository, DessertRepository dessertRepository,
                               FirstRepository firstRepository, SecondDishRepository secondDishRepository,
                               IngredientRepository ingredientRepository) {
        this.appetizerRepository = appetizerRepository;
        this.dessertRepository = dessertRepository;
        this.firstRepository = firstRepository;
        this.secondDishRepository = secondDishRepository;
        this.ingredientRepository = ingredientRepository;
    }

    @GetMapping
    public ResponseEntity findAppetizerRecipe(@RequestParam(required = false) String title) {
        if (title == null) {
            return ResponseEntity.ok(appetizerRepository.findAll());
        } else {
            try {
                return ResponseEntity.ok(appetizerRepository.findByTitleLike(title.toLowerCase()));
            } catch (RecipeNotFoundException r) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(r.getMessage());
            }
        }
    }
}
