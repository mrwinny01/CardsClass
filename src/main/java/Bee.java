public class Bee extends Cards{

    private String name;
    private int speed;
    private int build;

    public Bee(){
        this.name = name;
        this.speed = speed;
        this.build = build;
    }

    public String getName () {
        return name;
    }

    public void setName (String name){
        this.name = name;
    }

    public int getSpeed () {
       return speed;
    }

    public void setSpeed (int speed){
        this.speed = speed;
    }

    public void buildingFlorish(int speed, int build){
        this.build = speed * build;
    }

}
