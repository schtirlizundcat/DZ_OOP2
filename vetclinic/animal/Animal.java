package vetclinic.animal;//1) Добавить в класс vetclinice.animal.Animal public методы двигаться(toGo),
// летать(fly), плавать(swim).
// 2) Создать по два класса наследника vetclinice.animal.Animal,
// умеющих летать, плавать, бегать
// (животное может как уметь что-то одно, так и все сразу).
// В main добиться того, чтобы при вызове метода действия,
// которое конкретное животное не умеет,
// оно этого не делало (кошки не летают, рыбы не ходят)
//4) В файле readme.md в репозитории гитхаб описать
//какие проблемы в таком проектировании Вы увидели,
//а также там же написать возникшие при выполнении дз вопросы
//        (если они есть)


public class Animal {
    public String animalName;
    public boolean canGo;
    public boolean canFly;
    public boolean canSwim;

//    vetclinice.animal.Animal() {
//        // System.out.println("Создан экземпляр vetclinice.animal.Animal со стандартными параметрами.");
//    }

//    public vetclinice.animal.Animal(Date dateOfBarth) {
//        System.out.println("Создан экземпляр vetclinice.animal.Animal с датой рождения " + dateOfBarth);
//    }

//    String name;

    // Определяем методы, и выводим информацию о том, умеет ли то или иное животное совершать соответствующее действие.
//    public void toGo() {
//        if (animalName.isEmpty()) name = "Животное";
//        else name = animalName;
//        if (!canGo) System.out.println(name + " не умеет двигаться.");
//        else System.out.println(name + " двигается.");
//    }

//    public double fly() {
//        if (animalName.isEmpty()) name = "Животное";
//        else name = animalName;
//        if (!canFly) System.out.println(name + " не умеет летать.");
//        else System.out.println(name + " летает.");
//        return 0;
//    }

//    public void swim() {
//        if (animalName.isEmpty()) name = "Животное";
//        else name = animalName;
//        if (!canSwim) System.out.println(name + " не умеет плавать.");
//        else System.out.println(name + " плавает.");
//    }
}
