package vetclinic.animal;

public class Crocodile extends Animal implements Goable, Swimable{
        public Crocodile() {
                animalName = "Крокодил";
                canGo = true;
                canFly = false;
                canSwim = true;

        }

        @Override
        public double run() {
               return 4.0;
        }

        @Override
        public double swim() {
                return 6.0;
        }
}