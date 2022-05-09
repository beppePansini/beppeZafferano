package com.example.beppeZafferano.model.entities;

import javax.persistence.*;

@Entity
@Table(name = "second_dishes")
public class Second {
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
    private String firstStepScnd;
    @Column(name = "second_step")
    private String secondStepScnd;
    @Column(name = "third_step")
    private String thirdStepScnd;
    @Column(name = "fourth_step")
    private String fourthStepScnd;
    @Column(name = "fifth_step")
    private String fifthStepScnd;
    @Column(name = "favorite")
    private boolean isFavorite;

    public Second() {
    }

    public Second(int id, Ingredient firstIngredient, Ingredient secondIngredient, Ingredient thirdIngredient,
                  Ingredient fourthIngredient, Ingredient fifthIngredient, Ingredient sixthIngredient,
                  Ingredient seventhIngredient, Ingredient eighthIngredient, String firstStepScnd,
                  String secondStepScnd, String thirdStepScnd, String fourthStepScnd,
                  String fifthStepScnd, boolean isFavorite) {
        this.id = id;
        this.firstIngredient = firstIngredient;
        this.secondIngredient = secondIngredient;
        this.thirdIngredient = thirdIngredient;
        this.fourthIngredient = fourthIngredient;
        this.fifthIngredient = fifthIngredient;
        this.sixthIngredient = sixthIngredient;
        this.seventhIngredient = seventhIngredient;
        this.eighthIngredient = eighthIngredient;
        this.firstStepScnd = firstStepScnd;
        this.secondStepScnd = secondStepScnd;
        this.thirdStepScnd = thirdStepScnd;
        this.fourthStepScnd = fourthStepScnd;
        this.fifthStepScnd = fifthStepScnd;
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

    public String getFirstStepScnd() {
        return firstStepScnd;
    }

    public void setFirstStepScnd(String firstStepScnd) {
        this.firstStepScnd = firstStepScnd;
    }

    public String getSecondStepScnd() {
        return secondStepScnd;
    }

    public void setSecondStepScnd(String secondStepScnd) {
        this.secondStepScnd = secondStepScnd;
    }

    public String getThirdStepScnd() {
        return thirdStepScnd;
    }

    public void setThirdStepScnd(String thirdStepScnd) {
        this.thirdStepScnd = thirdStepScnd;
    }

    public String getFourthStepScnd() {
        return fourthStepScnd;
    }

    public void setFourthStepScnd(String fourthStepScnd) {
        this.fourthStepScnd = fourthStepScnd;
    }

    public String getFifthStepScnd() {
        return fifthStepScnd;
    }

    public void setFifthStepScnd(String fifthStepScnd) {
        this.fifthStepScnd = fifthStepScnd;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }
}
