package HomeWork_8_Participant;

public class RunningTrack extends Obstacle {
    private static final String overcome = "run";

    public RunningTrack(String name ,int lenth) {
        super(name, lenth);
    }

    @Override
    String overcome() {
        return overcome;
    }

    @Override
    public int getLenth() {
        return super.getLenth();
    }

    @Override
    public String getName() {
        return super.getName();
    }
}