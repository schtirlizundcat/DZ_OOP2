package vetclinic.animal;

public class Yellowbelly extends Animal implements Goable, Swimable {

    public Yellowbelly() {
        animalName = "Желтопузик"; // Это безлапая ящерица
        canGo = true;
        canFly = false;
        canSwim = true;
    }

    @Override
    public double run() {
        return 3.0;
    }
    @Override
    public double swim() {
        return 3.0;
    }
}
