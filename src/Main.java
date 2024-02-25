import units.*;

import java.util.*;

/** Проанализировать персонажей "Крестьянин, Разбойник, Снайпер, Колдун, Копейщик, Арбалетчик, Монах".
 * Для каждого определит 8 полей данных(здоровье, сила итд) 3-4 поля поведения(методов атаковать, вылечить итд).
 * Создать абстрактный класс и иерархию наследников. Расположить классы в пакет так,
 * чтобы в основной программе не было видно их полей. В не абстрактных классах переопределить метод toString()
 * так, чтобы он возвращал название класса или имя. Создать в основной программе по одному объекту каждого
 * не абстрактного класса и вывести в консоль его имя.
 * */
public class Main {
    public static void main(String[] args) {

        Magician magician1 = new Magician("Ivan");
        System.out.println(magician1);

        Crossbowman crossbowman1 = new Crossbowman("John");
        System.out.println(crossbowman1);

        Monk monk1 = new Monk("Lilly");
        System.out.println(monk1);

        Bandit bandit1 = new Bandit("Harry");
        System.out.println(bandit1);

        Sniper sniper1 = new Sniper("Leon");
        System.out.println(sniper1);

        Peasant peasant1 = new Peasant("Bob");
        System.out.println(peasant1);

        Spearman spearman1 = new Spearman("Ron");
        System.out.println(spearman1);

//        spearman1.print();

    }
}
