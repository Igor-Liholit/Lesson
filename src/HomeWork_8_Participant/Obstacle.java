package HomeWork_8_Participant;

public abstract class Obstacle {

    private final String name;
    private int lenth;
    private double hight;

    public Obstacle(String name, int lenth){
        this.name = name;
        this.lenth = lenth;
    }

    public Obstacle(String name, double hight){
        this.name = name;
        this.hight = hight;
    }

    abstract String overcome();

    public int getLenth() {
        return lenth;
    }

    public double getHight() {
        return hight;
    }

    public String getName() {
        return name;
    }
}