package vetclinic.animal;

public class Draco extends Animal implements Goable, Swimable, Flyable {
    public Draco() {
        animalName = "Летучий дракон"; // Это ящерица и она может всё.
        canGo = true;
        canFly = true;
        canSwim = true;

    }

    @Override
    public double fly() {
        return 1.0;
    }

    @Override
    public double swim() {
        return 4.0;
    }

    @Override
    public double run() {
        return 6.0;
    }

}
