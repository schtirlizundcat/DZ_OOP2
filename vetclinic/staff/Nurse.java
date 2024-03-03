package vetclinic.staff;

import vetclinic.animal.Animal;

public class Nurse extends MedicalStaff implements MakesInjection, MakesBandage {
    public Nurse() {
        position = "Медицинская сестра";
    }

//    public String fullName;

    public Nurse(String name) {
        fullName = name;
        position = "Медицинская сестра";
    }

    @Override
    public void makeinjection(Animal a) {
        System.out.println("Медицинская сестра " + fullName + " делает укол животному: " + a.animalName + ".");
    }

    @Override
    public void makebandage(Animal a) {
        System.out.println("Медицинская сестра " + fullName + " делает перевязку животному: " + a.animalName + ".");
    }
}