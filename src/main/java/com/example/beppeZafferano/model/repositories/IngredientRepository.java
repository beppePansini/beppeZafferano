package com.example.beppeZafferano.model.repositories;

import com.example.beppeZafferano.model.entities.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {
}
