package com.example.beppeZafferano.model.repositories;

import com.example.beppeZafferano.model.entities.Second;
import com.example.beppeZafferano.model.exceptions.RecipeNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SecondDishRepository extends JpaRepository<Second, Integer> {
    @Query("select s from Second s where lower(s.title) like %:title%")
    List<Second> findByTitleLike(String title) throws RecipeNotFoundException;
}
