package HomeWork_8_Participant;

public class Wall extends Obstacle {
    private static final String overcome = "climb over";

    public Wall(String name, double hight) {
        super(name, hight);
    }

    @Override
    String overcome() {
        return overcome;
    }

    @Override
    public double getHight() {
        return super.getHight();
    }

    @Override
    public String getName() {
        return super.getName();
    }
}