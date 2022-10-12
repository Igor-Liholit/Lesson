package HomeWork_8_Participant;

public class TestClass {
    public static void main(String[] args) {
        Human vova = new Human("Vova", 1357, 2.7);
        Human igor = new Human("Igor", 978, 2);
        Human sasha = new Human("Sasha", 925, 1.7);

        Cat rudik = new Cat("Rudik", 500, 3.8);
        Cat murzik = new Cat("Murzik", 600, 5);
        Cat marik = new Cat("Marik", 4570, 2.6);

        Robot KT_03 = new Robot("KT_03", 7897, 6);
        Robot IJ_08 = new Robot("IJ_08", 8571, 12);
        Robot WE_06 = new Robot("WE_06", 9871, 15);

        Participant[] participants = {vova, igor, sasha,
                rudik, murzik, marik,
                KT_03, IJ_08, WE_06};

        RunningTrack track = new RunningTrack("running track", 1500);
        System.out.println();

        Wall woodenWall = new Wall("wooden wall", 3);
        System.out.println();

        Obstacle[] obstacles = {track, woodenWall};
        startCompetition(participants, obstacles);
    }

    public static void startCompetition(Participant[] participants, Obstacle[] obstacles){
        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                if (j != 1) {
                    if(participants[i].getRunningDistance() < obstacles[j].getLenth()){
                        System.out.println(participants[i].getName() + " cannot overcome the " + obstacles[j].getName() + " and" +
                                " is eliminated from the competition");
                        i++;
                    } else if (participants[i].getJumpHeight() < obstacles[j].getHight()) {
                        System.out.println(participants[i].getName() + " cannot overcome the " + obstacles[j].getName() + " and" +
                                " is eliminated from the competition");
                        i++;
                    }
                }
                participants[i].run(obstacles[j]);
                participants[i].jump(obstacles[j]);
            }
        }
    }
}