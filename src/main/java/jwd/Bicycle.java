package jwd;

public class Bicycle extends Cards{

    private String name;
    private int costCard;
    private int rarity;
    private int lotSize;

    public Bicycle (String name, String firstName, String lastName,
                    int id,int costCard, int rarity, int lotSize) {
        super(name, firstName, lastName, id);
        this.name = name;
        this.costCard = costCard;
        this.rarity = rarity;
        this.lotSize = lotSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void calculateCostTheCard(int rarity, int lotSize){
        this.costCard = rarity / lotSize;
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
        return "Cards [ Name cards = " + name
                + "costCards = " + costCard
                + "rarity" + rarity
                + "lotSize" + lotSize +"]";
    }
}
