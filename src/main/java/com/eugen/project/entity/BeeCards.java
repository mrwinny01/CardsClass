package com.eugen.project.entity;

import com.eugen.project.entity.Cards;

public class BeeCards extends Cards {

    private String cardsName;
    private int florishSpeed;
    private int Cardsslip;
    private int сardsWeight;


    public BeeCards(String cardsName, String firstName, String lastName,
               int florishSpeed, int Cardsslip, int сardsWeight ){
        super(cardsName, firstName, lastName);
        this.cardsName = cardsName;
        this.florishSpeed = florishSpeed;
        this.Cardsslip = Cardsslip;
        this.сardsWeight = сardsWeight;
    }


    public String getCardsName () {
        return cardsName;
    }

    public void setCardsName (String name){
        this.cardsName = cardsName;
    }

    public void calculateFlorishSpeed(int Cardsslip, int сardsWeight){
        this.florishSpeed = Cardsslip / сardsWeight;
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
        return "Cards [ cardsName = " + cardsName
                + "florishSpeed = " + florishSpeed
                + "Cardsslip = " + Cardsslip
                + "сardsWeight = " + сardsWeight + "]";
    }
}
