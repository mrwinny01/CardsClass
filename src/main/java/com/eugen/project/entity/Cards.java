package com.eugen.project.entity;

import java.util.Objects;

public class Cards {

    private String cardsName;
    private String firstName;
    private String lastName;
    private int id;


    public Cards(String cardsName, String firstName, String lastName) {
        this.cardsName = cardsName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = ++id;
    }

    public String getCardsName() {
        return cardsName;
    }

    public void setCardsName(String cardsName) {
        this.cardsName = cardsName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cards cards = (Cards) o;
        return id == cards.id && Objects.equals(cardsName, cards.cardsName)
                && Objects.equals(firstName, cards.firstName)
                && Objects.equals(lastName, cards.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardsName, firstName, lastName, id);
    }

    @Override
    public String toString() {
        return "Cards{" +
                "cardsName='" + cardsName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }
}