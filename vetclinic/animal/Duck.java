package vetclinic.animal;

public class Duck extends Animal implements Flyable, Swimable, Goable {
    // Определяем конструктор, и в нём задаем конкретные значения переменных, характерных этому животному
    public Duck() {
        animalName = "Утка";
        canGo = true;
        canFly = true;
        canSwim = true;

    }

    @Override
    public double fly() {
        return 5.0;
    }

    @Override
    public double swim() {
        return 3.0;
    }

    @Override
    public double run() {
        return 3.0;
    }

}
