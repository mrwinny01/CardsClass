public class Tally_ho extends Cards {

    private String name;
    private int speed;
    private int slip;
    private int weight;

    public Tally_ho() {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int slip, int weight) {
        this.speed = slip * weight;
    }
}
