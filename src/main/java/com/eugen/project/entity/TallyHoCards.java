package com.eugen.project.entity;

import com.eugen.project.entity.Cards;

import java.util.Objects;

public class TallyHoCards extends Cards {

    private String cardsName;
    private int numberOfPacks;

    public TallyHoCards (String CardsName, String firstName,
                   String lastName, int numberOfPacks) {
        super(CardsName, firstName, lastName);
        this.cardsName = CardsName;
        this.numberOfPacks = numberOfPacks;
    }

    public String getCardsName() {
        return cardsName;
    }

    public void setCardsName(String name) {
        this.cardsName = cardsName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TallyHoCards that = (TallyHoCards) o;
        return numberOfPacks == that.numberOfPacks && Objects.equals(cardsName, that.cardsName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cardsName, numberOfPacks);
    }

    @Override
    public String toString() {
        return super.toString() + "\nCards [ cardsName = " + cardsName + "]";
    }
}
