package com.example.beppeZafferano.model.repositories;

import com.example.beppeZafferano.model.entities.Appetizer;
import com.example.beppeZafferano.model.exceptions.RecipeNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AppetizerRepository extends JpaRepository<Appetizer, Integer> {
    @Query("select a from Appetizer a where lower(a.title) like %:title%")
    List<Appetizer> findByTitleLike(String title) throws RecipeNotFoundException;
}
