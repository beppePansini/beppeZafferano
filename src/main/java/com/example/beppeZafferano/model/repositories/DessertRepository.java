package com.example.beppeZafferano.model.repositories;

import com.example.beppeZafferano.model.entities.Dessert;
import com.example.beppeZafferano.model.exceptions.RecipeNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DessertRepository extends JpaRepository<Dessert, Integer> {
    @Query("select d from Dessert d where lower(d.title) like %:title%")
    List<Dessert> findByTitleLike(String title) throws RecipeNotFoundException;
}
