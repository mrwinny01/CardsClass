package com.eugen.project.entity;

import com.eugen.project.entity.Cards;

public class TallyHoCards extends Cards {

    private String cardsName;
    private int numberOfPack;

    public TallyHoCards (String CardsName, String firstName,
                   String lastName, int numberOfPack) {
        super(CardsName, firstName, lastName);
        this.cardsName = CardsName;
        this.numberOfPack = numberOfPack;
    }

    public String getCardsName() {
        return cardsName;
    }

    public void setCardsName(String name) {
        this.cardsName = cardsName;
    }

    @Override
    public boolean equals(Object obj) {
       return super.equals(obj);
    }

    @Override
    public int hashCode() {
       return super.hashCode();
    }

    @Override
    public String toString() {
        return "Cards [ cardsName = " + cardsName + "]";
    }
}
