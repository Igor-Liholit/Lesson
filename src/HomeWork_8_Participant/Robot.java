package HomeWork_8_Participant;

public class Robot extends Participant{
    public Robot(String name, double runningDistance, double jumpHeight) {
        super(name, runningDistance, jumpHeight);
    }

    @Override
    void run(Obstacle obstacle) {
        if (!(obstacle instanceof RunningTrack)){
            return;
        }

        System.out.println(getName() + " " + obstacle.overcome() +
                "s the track " + obstacle.getLenth() + " meters long");
    }

    @Override
    void jump(Obstacle obstacle) {
        if (!(obstacle instanceof Wall)){
            return;
        }

        System.out.println(getName() + " " + obstacle.overcome() + " the wall "
                + obstacle.getHight() + " meters long");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getRunningDistance() {
        return super.getRunningDistance();
    }

    @Override
    public double getJumpHeight() {
        return super.getJumpHeight();
    }
}