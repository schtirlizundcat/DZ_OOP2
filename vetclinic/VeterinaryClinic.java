package vetclinic;

import vetclinic.animal.*;
import vetclinic.staff.Doctor;
import vetclinic.staff.Nurse;

import java.util.ArrayList;

public class VeterinaryClinic {
    public ArrayList<Animal> animals;
//           = ArrayList<Animal>()

    public VeterinaryClinic() {
        animals = new ArrayList<>();
        animals.add(new Duck());
        animals.add(new Crocodile());
        animals.add(new Draco());
        animals.add(new Manul());
        animals.add(new SnowLeopard());
        animals.add(new Yellowbelly());
    }

    public void listGoable() {
        System.out.println("НАЧАЛО Список животных, которые умеют ходить:");
        for (Animal animal : animals) {
            if (animal instanceof Goable) {
                System.out.println(animal.animalName);
            }
        }
        System.out.println("КОНЕЦ Список животных, которые умеют ходить.\n");
    }

    public void listSwimable() {
        System.out.println("НАЧАЛО Список животных, которые умеют плавать:");
        for (Animal animal : animals) {
            if (animal instanceof Swimable) {
                System.out.println(animal.animalName);
            }
        }
        System.out.println("КОНЕЦ Список животных, которые умеют плавать.\n");
    }

    public void listFlyable() {
        System.out.println("НАЧАЛО Список животных, которые умеют летать:");
        for (Animal animal : animals) {
            if (animal instanceof Flyable) {
                System.out.println(animal.animalName);
            }
        }
        System.out.println("КОНЕЦ Список животных, которые умеют летать.\n");
    }

    public void cure(Doctor doctor, Animal animal) {
        doctor.cure(animal);
    }

    public void makeinjection(Nurse nurse, Animal animal) {
        nurse.makeinjection(animal);
    }

    public void makebandage(Nurse nurse, Animal animal) {
        nurse.makebandage(animal);
    }
}
