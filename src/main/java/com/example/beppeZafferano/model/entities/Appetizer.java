package com.example.beppeZafferano.model.entities;

import javax.persistence.*;


@Entity
@Table(name = "appetizer")
public class Appetizer {
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
    private String firstStepAptzr;
    @Column(name = "second_step")
    private String secondStepAptzr;
    @Column(name = "third_step")
    private String thirdStepAptzr;
    @Column(name = "fourth_step")
    private String fourthStepAptzr;
    @Column(name = "fifth_step")
    private String fifthStepAptzr;
    @Column(name = "favorite")
    private boolean isFavorite;

    public Appetizer() {
    }

    public Appetizer(int id, Ingredient firstIngredient, Ingredient secondIngredient, Ingredient thirdIngredient,
                     Ingredient fourthIngredient, Ingredient fifthIngredient, Ingredient sixthIngredient,
                     Ingredient seventhIngredient, Ingredient eighthIngredient, String firstStepAptzr,
                     String secondStepAptzr, String thirdStepAptzr, String fourthStepAptzr,
                     String fifthStepAptzr, boolean isFavorite) {
        this.id = id;
        this.firstIngredient = firstIngredient;
        this.secondIngredient = secondIngredient;
        this.thirdIngredient = thirdIngredient;
        this.fourthIngredient = fourthIngredient;
        this.fifthIngredient = fifthIngredient;
        this.sixthIngredient = sixthIngredient;
        this.seventhIngredient = seventhIngredient;
        this.eighthIngredient = eighthIngredient;
        this.firstStepAptzr = firstStepAptzr;
        this.secondStepAptzr = secondStepAptzr;
        this.thirdStepAptzr = thirdStepAptzr;
        this.fourthStepAptzr = fourthStepAptzr;
        this.fifthStepAptzr = fifthStepAptzr;
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

    public String getFirstStepAptzr() {
        return firstStepAptzr;
    }

    public void setFirstStepAptzr(String firstStepAptzr) {
        this.firstStepAptzr = firstStepAptzr;
    }

    public String getSecondStepAptzr() {
        return secondStepAptzr;
    }

    public void setSecondStepAptzr(String secondStepAptzr) {
        this.secondStepAptzr = secondStepAptzr;
    }

    public String getThirdStepAptzr() {
        return thirdStepAptzr;
    }

    public void setThirdStepAptzr(String thirdStepAptzr) {
        this.thirdStepAptzr = thirdStepAptzr;
    }

    public String getFourthStepAptzr() {
        return fourthStepAptzr;
    }

    public void setFourthStepAptzr(String fourthStepAptzr) {
        this.fourthStepAptzr = fourthStepAptzr;
    }

    public String getFifthStepAptzr() {
        return fifthStepAptzr;
    }

    public void setFifthStepAptzr(String fifthStepAptzr) {
        this.fifthStepAptzr = fifthStepAptzr;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }
}
