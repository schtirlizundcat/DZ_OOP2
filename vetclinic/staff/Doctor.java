package vetclinic.staff;

import vetclinic.animal.Animal;

public class Doctor extends MedicalStaff implements Cures{
//    public String fullName;
    Doctor() {
        position = "Тепапевт";
    }

    public Doctor(String name) {
        fullName = name;
        position = "Тепапевт";
    }
    public Doctor(String name, String pos) {
        fullName = name;
        position = pos;
    }

    @Override
    public void cure(Animal a) {
        System.out.println(position + " " + fullName + " лечит животное: " + a.animalName + ".");
    }
}
