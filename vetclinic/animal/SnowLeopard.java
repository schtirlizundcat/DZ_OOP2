package vetclinic.animal;

public class SnowLeopard extends Animal implements Goable {

    public SnowLeopard() {
        animalName = "Ирбис";
        canGo = true;
        canFly = false;
        canSwim = false;
    }

    @Override
    public double run() {
        return 10.0;
    }
}
