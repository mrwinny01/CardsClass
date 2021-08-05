package com.eugen.project.entity;

import com.eugen.project.entity.Cards;

import java.util.Objects;

public class TallyHoCards extends Cards {

    private int numberOfPacks;

    public TallyHoCards (String cardsName, String firstName,
                   String lastName, int numberOfPacks) {
        super(cardsName, firstName, lastName);
        this.numberOfPacks = numberOfPacks;
    }

    public int getNumberOfPacks() {
        return numberOfPacks;
    }

    public void setNumberOfPacks(int numberOfPacks) {
        this.numberOfPacks = numberOfPacks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TallyHoCards that = (TallyHoCards) o;
        return numberOfPacks == that.numberOfPacks;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfPacks);
    }

    @Override
    public String toString() {
        return super.toString()  +
                "\n, numberOfPacks=" + numberOfPacks +
                '}';
    }
}
