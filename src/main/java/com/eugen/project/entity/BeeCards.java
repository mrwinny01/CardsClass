package com.eugen.project.entity;

import com.eugen.project.entity.Cards;

import java.util.Objects;

public class BeeCards extends Cards {

    private int flourishSpeed;
    private int cardsSlip;
    private int сardsWeight;


    public BeeCards(String cardsName, String firstName, String lastName,
               int flourishSpeed, int cardsSlip, int сardsWeight ){
        super(cardsName, firstName, lastName);
        this.flourishSpeed = flourishSpeed;
        this.cardsSlip = cardsSlip;
        this.сardsWeight = сardsWeight;
    }

    public int getFlourishSpeed() {
        return flourishSpeed;
    }

    public void setFlourishSpeed(int flourishSpeed) {
        this.flourishSpeed = flourishSpeed;
    }

    public int getCardsSlip() {
        return cardsSlip;
    }

    public void setCardsSlip(int cardsSlip) {
        this.cardsSlip = cardsSlip;
    }

    public int getСardsWeight() {
        return сardsWeight;
    }

    public void setСardsWeight(int сardsWeight) {
        this.сardsWeight = сardsWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BeeCards beeCards = (BeeCards) o;
        return flourishSpeed == beeCards.flourishSpeed && cardsSlip == beeCards.cardsSlip && сardsWeight == beeCards.сardsWeight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), flourishSpeed, cardsSlip, сardsWeight);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n, flourishSpeed=" + flourishSpeed +
                ", cardsSlip=" + cardsSlip +
                ", сardsWeight=" + сardsWeight +
                '}';
    }
}
