package jwd;

public class BicycleCards extends Cards{

    private String cardsName;
    private int costCard;
    private int rarity;
    private int packagesNumber;

    public BicycleCards (String cardsName, String firstName, String lastName,
                    int costCard, int rarity, int packagesNumber) {
        super(cardsName, firstName, lastName);
        this.cardsName = cardsName;
        this.costCard = costCard;
        this.rarity = rarity;
        this.packagesNumber = packagesNumber;
    }

    public String getCardsName() {
        return cardsName;
    }

    public void setCardsName(String name) {
        this.cardsName = cardsName;
    }

    public void calculateCostCard(int rarity, int packagesNumber){
        this.costCard = rarity / packagesNumber;
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
                + "costCards = " + costCard
                + "rarity = " + rarity
                + "packagesNumber = " + packagesNumber +"]";
    }
}
