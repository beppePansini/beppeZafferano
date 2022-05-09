package com.example.beppeZafferano.model.entities;

import javax.persistence.*;

@Entity
@Table(name = "first_dishes")
public class First {
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
    private String firstStepFst;
    @Column(name = "second_step")
    private String secondStepFst;
    @Column(name = "third_step")
    private String thirdStepFst;
    @Column(name = "fourth_step")
    private String fourthStepFst;
    @Column(name = "fifth_step")
    private String fifthStepFst;
    @Column(name = "favorite")
    private boolean isFavorite;

    public First() {
    }

    public First(int id, Ingredient firstIngredient, Ingredient secondIngredient, Ingredient thirdIngredient,
                 Ingredient fourthIngredient, Ingredient fifthIngredient, Ingredient sixthIngredient,
                 Ingredient seventhIngredient, Ingredient eighthIngredient, String firstStepFst,
                 String secondStepFst, String thirdStepFst, String fourthStepFst,
                 String fifthStepFst, boolean isFavorite) {
        this.id = id;
        this.firstIngredient = firstIngredient;
        this.secondIngredient = secondIngredient;
        this.thirdIngredient = thirdIngredient;
        this.fourthIngredient = fourthIngredient;
        this.fifthIngredient = fifthIngredient;
        this.sixthIngredient = sixthIngredient;
        this.seventhIngredient = seventhIngredient;
        this.eighthIngredient = eighthIngredient;
        this.firstStepFst = firstStepFst;
        this.secondStepFst = secondStepFst;
        this.thirdStepFst = thirdStepFst;
        this.fourthStepFst = fourthStepFst;
        this.fifthStepFst = fifthStepFst;
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

    public String getFirstStepFst() {
        return firstStepFst;
    }

    public void setFirstStepFst(String firstStepFst) {
        this.firstStepFst = firstStepFst;
    }

    public String getSecondStepFst() {
        return secondStepFst;
    }

    public void setSecondStepFst(String secondStepFst) {
        this.secondStepFst = secondStepFst;
    }

    public String getThirdStepFst() {
        return thirdStepFst;
    }

    public void setThirdStepFst(String thirdStepFst) {
        this.thirdStepFst = thirdStepFst;
    }

    public String getFourthStepFst() {
        return fourthStepFst;
    }

    public void setFourthStepFst(String fourthStepFst) {
        this.fourthStepFst = fourthStepFst;
    }

    public String getFifthStepFst() {
        return fifthStepFst;
    }

    public void setFifthStepFst(String fifthStepFst) {
        this.fifthStepFst = fifthStepFst;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }
}