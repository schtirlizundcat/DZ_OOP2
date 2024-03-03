//Урок 2. Принципы ООП Абстракция и интерфейсы. Пример проектирования
//Создать класс Doctor и подумать над его состоянием и поведением.
//Создать класс Nurse(медсестра) и подумать над его состоянием и поведением.
//
//Создайте интерфейсы Goable, Flyable, Swimable. У интерфейсов должны быть
//методы получения скорости заданного действия: double run(), double fly(), double swim()
//
//Добавьте наследников этим интерфейсам, но таким образом,
//чтобы у каждого интерфейса было минимум по два наследника (при необходимости, добавьте в приложение новые классы)
//
//Создать класс ВетеринарнаяКлиника (VeterinaryClinic)
//У ветеринарной клиники добавьте методы получения всех бегающих, всех плавающих и всех летающих,
//а также методы для работы с персоналом клиники.
//
//Формат сдачи: ссылка на гитхаб

import vetclinic.VeterinaryClinic;
import vetclinic.animal.Animal;
import vetclinic.staff.Doctor;
import vetclinic.staff.Nurse;

import java.util.Random;

public class Main {
    public static void main(String args[]) {
        VeterinaryClinic v = new VeterinaryClinic();
        v.listGoable();
        v.listFlyable();
        v.listSwimable();
        Random random = new Random();
        int randomIndex = random.nextInt(v.animals.size());
        Doctor doctor = new Doctor("Айболит","Терапевт");
        Doctor doctor2 = new Doctor("Неболей","Хирург");
        Animal animalpatient = v.animals.get(randomIndex);
        v.cure(doctor, animalpatient);
        randomIndex = random.nextInt(v.animals.size());
        animalpatient = v.animals.get(randomIndex);
        v.cure(doctor2, animalpatient);
        randomIndex = random.nextInt(v.animals.size());
        animalpatient = v.animals.get(randomIndex);
        Nurse nurse = new Nurse("Неболит");
        v.makeinjection(nurse, animalpatient);
        randomIndex = random.nextInt(v.animals.size());
        animalpatient = v.animals.get(randomIndex);
        v.makebandage(nurse, animalpatient);

    }
}
