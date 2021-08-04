package jwd;

public class Bee extends Cards{

    private String name;
    private int florishSpeed;
    private int slipCard;
    private int massCard;


    public Bee(String name, String firstName, String lastName,
               int id, int florishSpeed, int slipCard, int massCard ){
        super(name, firstName, lastName, id);
        this.name = name;
        this.florishSpeed = florishSpeed;
        this.slipCard = slipCard;
        this.massCard = massCard;
    }


    public String getName () {
        return name;
    }

    public void setName (String name){
        this.name = name;
    }

    public void calculateTheFlorishSpeed(int slipCard, int massCard){
        this.florishSpeed = slipCard / massCard;
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
                + "florishSpeed = " + florishSpeed
                + "slip card = " + slipCard
                + "massCard = " + massCard + "]";
    }
}
