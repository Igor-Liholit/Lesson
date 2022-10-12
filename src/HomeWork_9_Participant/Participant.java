package HomeWork_9_Participant;

public abstract class Participant {
    private final String name;
    private final double runningDistance;
    private final double jumpHeight;

    public Participant(String name, double runningDistance, double jumpHeight) {
        this.name = name;
        this.runningDistance = runningDistance;
        this.jumpHeight = jumpHeight;
    }

    abstract void run(Obstacle obstacle);

    abstract void jump(Obstacle obstacle);

    public String getName() {
        return name;
    }

    public double getRunningDistance() {
        return runningDistance;
    }

    public double getJumpHeight() {
        return jumpHeight;
    }
}