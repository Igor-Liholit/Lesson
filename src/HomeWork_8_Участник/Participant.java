package HomeWork_8_Участник;

public   abstract class Participant {

    private static String view;

    public Participant( String view, double jumpLong , double runDictance) {
        this.view = view;
        jump(jumpLong);
        run(runDictance);
    }

    public static void jump(double jumpLong){
        System.out.println( view +  "прыгнул " + jumpLong );
    }

    public static void run(double runDitance){
        System.out.println( view +  "Пробежал " + runDitance );
    }
}
