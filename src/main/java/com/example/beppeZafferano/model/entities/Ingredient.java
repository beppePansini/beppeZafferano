package com.example.beppeZafferano.model.entities;

import javax.persistence.*;

@Entity
@Table(name = "ingredients")
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name_ingredient")
    private String firstIngredient;


    public Ingredient() {
    }

    public Ingredient(int id, String firstIngredient) {
        this.id = id;
        this.firstIngredient = firstIngredient;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstIngredient() {
        return firstIngredient;
    }

    public void setFirstIngredient(String firstIngredient) {
        this.firstIngredient = firstIngredient;
    }
}
