package com.eugen.project.entity;

import com.eugen.project.entity.Cards;

import java.util.Objects;

public class BicycleCards extends Cards {

    private int cardsCost;
    private int rareness;
    private int numOfPackages;

    public BicycleCards (String cardsName, String firstName, String lastName,
                    int cardsCost, int rareness, int numOfPackages) {
        super(cardsName, firstName, lastName);
        this.cardsCost = cardsCost;
        this.rareness = rareness;
        this.numOfPackages = numOfPackages;
    }

    public int getCardsCost() {
        return cardsCost;
    }

    public void setCardsCost(int cardsCost) {
        this.cardsCost = cardsCost;
    }

    public int getRareness() {
        return rareness;
    }

    public void setRareness(int rareness) {
        this.rareness = rareness;
    }

    public int getNumOfPackages() {
        return numOfPackages;
    }

    public void setNumOfPackages(int numOfPackages) {
        this.numOfPackages = numOfPackages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BicycleCards that = (BicycleCards) o;
        return cardsCost == that.cardsCost && rareness == that.rareness && numOfPackages == that.numOfPackages;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cardsCost, rareness, numOfPackages);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ncardsCost=" + cardsCost +
                ", rareness=" + rareness +
                ", numOfPackages=" + numOfPackages +
                '}';
    }
}
