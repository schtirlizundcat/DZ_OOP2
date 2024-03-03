package vetclinic.animal;

public class Manul extends Animal implements Goable {

    public Manul() {
        animalName = "Манул";
        canGo = true;
        canFly = false;
        canSwim = false;
    }

    @Override
    public double run() {
        return 10.0;
    }

}
