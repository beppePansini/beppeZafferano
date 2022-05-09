package com.example.beppeZafferano.model.repositories;

import com.example.beppeZafferano.model.entities.First;
import com.example.beppeZafferano.model.exceptions.RecipeNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FirstRepository extends JpaRepository<First, Integer> {
    @Query("select f from First f where lower(f.title) like %:title%")
    List<First> findByTitleLike(String title) throws RecipeNotFoundException;
}
