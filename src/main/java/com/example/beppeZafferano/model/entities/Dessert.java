package com.example.beppeZafferano.model.entities;

import javax.persistence.*;

@Entity
@Table(name = "desserts")
public class Dessert {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    @JoinColumn(name = "first_ingredient_id")
    private Ingredient firstIngredient;
    @ManyToOne
    @JoinColumn(name = "second_ingredient_id")
    private Ingredient secondIngredient;
    @ManyToOne
    @JoinColumn(name = "third_ingredient_id")
    private Ingredient thirdIngredient;
    @ManyToOne
    @JoinColumn(name = "fourth_ingredient_id")
    private Ingredient fourthIngredient;
    @ManyToOne
    @JoinColumn(name = "fifth_ingredient_id")
    private Ingredient fifthIngredient;
    @ManyToOne
    @JoinColumn(name = "sixth_ingredient_id")
    private Ingredient sixthIngredient;
    @ManyToOne
    @JoinColumn(name = "seventh_ingredient_id")
    private Ingredient seventhIngredient;
    @ManyToOne
    @JoinColumn(name = "eighth_ingredient_id")
    private Ingredient eighthIngredient;
    @Column(name = "first_step")
    private String firstStepDsrt;
    @Column(name = "second_step")
    private String secondStepDsrt;
    @Column(name = "third_step")
    private String thirdStepDsrt;
    @Column(name = "fourth_step")
    private String fourthStepDsrt;
    @Column(name = "fifth_step")
    private String fifthStepDsrt;
    @Column(name = "favorite")
    private boolean isFavorite;

    public Dessert() {
    }

    public Dessert(int id, Ingredient firstIngredient, Ingredient secondIngredient, Ingredient thirdIngredient,
                   Ingredient fourthIngredient, Ingredient fifthIngredient, Ingredient sixthIngredient,
                   Ingredient seventhIngredient, Ingredient eighthIngredient, String firstStepDsrt,
                   String secondStepDsrt, String thirdStepDsrt, String fourthStepDsrt,
                   String fifthStepDsrt, boolean isFavorite) {
        this.id = id;
        this.firstIngredient = firstIngredient;
        this.secondIngredient = secondIngredient;
        this.thirdIngredient = thirdIngredient;
        this.fourthIngredient = fourthIngredient;
        this.fifthIngredient = fifthIngredient;
        this.sixthIngredient = sixthIngredient;
        this.seventhIngredient = seventhIngredient;
        this.eighthIngredient = eighthIngredient;
        this.firstStepDsrt = firstStepDsrt;
        this.secondStepDsrt = secondStepDsrt;
        this.thirdStepDsrt = thirdStepDsrt;
        this.fourthStepDsrt = fourthStepDsrt;
        this.fifthStepDsrt = fifthStepDsrt;
        this.isFavorite = isFavorite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Ingredient getFirstIngredient() {
        return firstIngredient;
    }

    public void setFirstIngredient(Ingredient firstIngredient) {
        this.firstIngredient = firstIngredient;
    }

    public Ingredient getSecondIngredient() {
        return secondIngredient;
    }

    public void setSecondIngredient(Ingredient secondIngredient) {
        this.secondIngredient = secondIngredient;
    }

    public Ingredient getThirdIngredient() {
        return thirdIngredient;
    }

    public void setThirdIngredient(Ingredient thirdIngredient) {
        this.thirdIngredient = thirdIngredient;
    }

    public Ingredient getFourthIngredient() {
        return fourthIngredient;
    }

    public void setFourthIngredient(Ingredient fourthIngredient) {
        this.fourthIngredient = fourthIngredient;
    }

    public Ingredient getFifthIngredient() {
        return fifthIngredient;
    }

    public void setFifthIngredient(Ingredient fifthIngredient) {
        this.fifthIngredient = fifthIngredient;
    }

    public Ingredient getSixthIngredient() {
        return sixthIngredient;
    }

    public void setSixthIngredient(Ingredient sixthIngredient) {
        this.sixthIngredient = sixthIngredient;
    }

    public Ingredient getSeventhIngredient() {
        return seventhIngredient;
    }

    public void setSeventhIngredient(Ingredient seventhIngredient) {
        this.seventhIngredient = seventhIngredient;
    }

    public Ingredient getEighthIngredient() {
        return eighthIngredient;
    }

    public void setEighthIngredient(Ingredient eighthIngredient) {
        this.eighthIngredient = eighthIngredient;
    }

    public String getFirstStepDsrt() {
        return firstStepDsrt;
    }

    public void setFirstStepDsrt(String firstStepDsrt) {
        this.firstStepDsrt = firstStepDsrt;
    }

    public String getSecondStepDsrt() {
        return secondStepDsrt;
    }

    public void setSecondStepDsrt(String secondStepDsrt) {
        this.secondStepDsrt = secondStepDsrt;
    }

    public String getThirdStepDsrt() {
        return thirdStepDsrt;
    }

    public void setThirdStepDsrt(String thirdStepDsrt) {
        this.thirdStepDsrt = thirdStepDsrt;
    }

    public String getFourthStepDsrt() {
        return fourthStepDsrt;
    }

    public void setFourthStepDsrt(String fourthStepDsrt) {
        this.fourthStepDsrt = fourthStepDsrt;
    }

    public String getFifthStepDsrt() {
        return fifthStepDsrt;
    }

    public void setFifthStepDsrt(String fifthStepDsrt) {
        this.fifthStepDsrt = fifthStepDsrt;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }
}
