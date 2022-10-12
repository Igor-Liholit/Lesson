package HomeWork_7;

public class myPets {
    public static void main(String[] args) {
        Cat marsik = new Cat("Marsik", 200, 0);
        System.out.println();

        Cat vasia = new Cat("Vasia", 55, 1);
        System.out.println();

        Dog volt = new Dog("Volt", 600, 10);
        System.out.println();

        Dog bosik = new Dog("Bosik", 255 , 15);

        Animal.animalCounter();
        System.out.println();

        Cat.catsCounter();
        Dog.godsCounter();
    }
}
