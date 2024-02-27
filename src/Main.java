import units.*;

import java.util.*;

/** Seminar 1
 *
 * Проанализировать персонажей "Крестьянин, Разбойник, Снайпер, Колдун, Копейщик, Арбалетчик, Монах".
 * Для каждого определит 8 полей данных(здоровье, сила итд) 3-4 поля поведения(методов атаковать, вылечить итд).
 * Создать абстрактный класс и иерархию наследников. Расположить классы в пакет так,
 * чтобы в основной программе не было видно их полей. В не абстрактных классах переопределить метод toString()
 * так, чтобы он возвращал название класса или имя. Создать в основной программе по одному объекту каждого
 * не абстрактного класса и вывести в консоль его имя.
 * */

/** Seminar 2
 * Добавить в проект класс, предназначенный для хранения координат.
 * Добавить в абстрактный класс поле, экземпляр класс координат.
 * Пробросить координаты через конструкторы наследников так,
 * чтобы создавая объекты вы передавали в параметрах имя и аоординаты.
 * Скорректировать алгоритм заполнения комманд. Кроме имён каждый персонаж должен иметь координаты.
 * Одна комманда находится с левой стороны другая с правой(у=0 и у=9).
 * В класс лучников добавить метод поиск ближайшего противника.
 * Алгоритм расчёта расстояний реализовать в классе координат.
 */
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Unit> team1 = new ArrayList<>();
        ArrayList<Unit> team2 = new ArrayList<>();
        int teamcount = 10;
        for (int i = 0; i < teamcount; i++) {
            int val = random.nextInt(7);
            int coordX1 = random.nextInt(10);
            int coordX2 = random.nextInt(10);
            Position xy1 = new Position(coordX1, 1);
            Position xy2 = new Position(coordX2, 10);
            System.out.println(xy1);
            switch (val){
                case 0:
                    team1.add(new Bandit(getName(), i, 1));
                    break;
                case 1:
                    team1.add(new Crossbowman(getName(), i, 1));
                    break;
                case 2:
                    team1.add(new Magician(getName(), i, 1));
                    break;
                case 3:
                    team1.add(new Monk(getName(), i, 1));
                    break;
                case 4:
                    team1.add(new Peasant(getName(), i, 1));
                    break;
                case 5:
                    team1.add(new Sniper(getName(), i, 1));
                case 6:
                    team1.add(new Spearman(getName(), i, 1));
                    break;
            }
        }
//        System.out.println(team1);
    }

//    Random random = new Random();

    public static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
    }











    //        Magician magician1 = new Magician("Ivan");
//        System.out.println(magician1);
//
//        Crossbowman crossbowman1 = new Crossbowman("John");
//        System.out.println(crossbowman1);
//
//        Monk monk1 = new Monk("Lilly");
//        System.out.println(monk1);
//
//        Bandit bandit1 = new Bandit("Harry");
//        System.out.println(bandit1);
//
//        Sniper sniper1 = new Sniper("Leon");
//        System.out.println(sniper1);
//
//        Peasant peasant1 = new Peasant("Bob");
//        System.out.println(peasant1);
//
//        Spearman spearman1 = new Spearman("Ron");
//        System.out.println(spearman1);
}





