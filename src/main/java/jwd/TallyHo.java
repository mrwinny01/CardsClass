package jwd;

public class TallyHo extends Cards {

    private String name;
    private int numberOfPack;

    public TallyHo(String name, String firstName, String lastName, int id) {
        super(name, firstName, lastName, id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPack() {
        return  numberOfPack;
    }

    public void setNumberOfPack(int numberOfPack) {
        this.numberOfPack = numberOfPack;
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
        return "Cards [ Name cards = " + name + "]";
    }
}
