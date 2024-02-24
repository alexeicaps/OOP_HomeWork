import units.Crossbowman;
import units.Magician;
import units.Names;

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
        Random random = new Random();

        Magician magician1 = new Magician("Ivan");
        magician1.print();

        Crossbowman crossbowman = new Crossbowman(random.toString(Names));
        crossbowman.print();
    }
}
