package HomeWork_8_Участник;

public   abstract class Participant {

    public Participant( double jumpLong , double runDictance) {
        jump(jumpLong);
        run(runDictance);
    }

    public static void jump(double jumpLong){
        System.out.println( "Пробежал" );
    }

    public static void run(double runDitance){

    }
}
