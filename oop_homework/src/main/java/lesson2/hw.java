package lesson2;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class hw {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    /**
     * Задание
     * <p>
     * Предположим, вы разрабатываете какую-то компьютерную игру, в которой есть несколько типов объектов (классов):
     * 1. Здание (имеет текущий уровень здоровья)
     * 2. Герой (имеет текущий уровень здоровья и текущий уровень магической энергии)
     * 3. Нейтральный персонаж (имеет текущий уровень здоровья)
     * <p>
     * Также у вас есть класс Render с методом showIndicator, который срабатывает при наведении мышки на объект
     * и работает следующим образом:
     * 1. Если объект обладает уровнем здоровья, то отображается индикатор с текущим уровнем здоровья.
     * 2. Если объект обладает уровнем магический энергии, то отображается индикатор с текущим уровнем энергии.
     * * В качестве упрощения, пусть вывод на дисплей это запись информации в консоль.
     * * То есть вы пишете код, который выводит на консоль информацию.
     * <p>
     * <p>
     * Подсказка: нужно ввести 2 интерфейса: наличие здоровья и наличие магической энергии.
     * В классе Render проверять только на эти интерфейсы и выводить нужную информацию.
     * Необходимо продумать, какие методы должны быть в интерфейсе.
     * <p>
     * ЧТО ДЕЛАТЬ НЕ НУЖНО:
     * Нельзя завязываться на конкретные классы. Предполагается, что таких классов очень много и они постоянно добавляются.
     * <p>
     * * Необязательные задания, которые не относятся к теме, но при сильном желании можно реализовать.
     * * Со звездочкой: реализовать в консоли отображение индикатора.
     * Например, при максимальном уровне здоровья 100 и текущем 40 можно отобразить вот такую ленточку: [xxxx      ]
     * ** С двумя звездочками: раскрасить вывод. Чем меньше здоровья, тем "краснее" цвет индикатора. Для полного здоровья - цвет зеленый.
     */

    public static void main(String[] args) {
        Render render = new Render();

        Building building = new Building(100);
        building.setCurrentHealthPoint(10);
        System.out.println(building.getClass().getName());
        render.showIndicator(building);
        System.out.println();

        Hero hero = new Hero(100,100);
        hero.setCurrentHealthPoint(50);
        hero.setCurrentManaPoint(80);
        System.out.println(hero.getClass().getName());
        render.showIndicator(hero);

        // В консоли должно быть примерно так: Текущий уровень здоровья: 50, максимальный уровень здоровья: 100

//            System.out.println(ANSI_RED + "This text has a red background but default text!" + ANSI_RESET);
//            System.out.println(ANSI_GREEN + "This text has a green background but default text!" + ANSI_RESET);


    }

    static class Render {

        /**
         * Если объект обладает уровнем здоровья, то отображается индикатор с текущим уровнем здоровья.
         * Если объект обладает уровнем магический энергии, то отображается индикатор с текущим уровнем энергии.
         * * В качестве упрощения, пусть вывод на дисплей = запись информации в консоль.
         */
        public void showIndicator(Object object) {
            // Не должно быть упоминания конкретных классов!!!
            if (object instanceof haveHealth) {
                int maxHp = ((haveHealth) object).getMaxHealth();
                int currentHp = ((haveHealth) object).getCurrentHealth();
                StringBuilder list = new StringBuilder();
                for (int i = 0; i < 10; i++) {
                    if (currentHp * 10 / maxHp >= i + 1) {
                        list.append("+");
                    } else list.append("_");
                }
                if (currentHp * 10 / maxHp >= 7) {
                    System.out.println(ANSI_GREEN + "[" + list + "]");
                } else if (currentHp * 10 / maxHp > 3) {
                    System.out.println(ANSI_YELLOW + "[" + list + "]");
                } else System.out.println(ANSI_RED + "[" + list + "]");

                if(object instanceof haveMana) {
                    int maxMana = ((haveMana) object).getMaxMana();
                    int currentMana = ((haveMana) object).getCurrentMana();
                    StringBuilder list2 = new StringBuilder();
                    for (int i = 0; i < 10; i++) {
                        if (currentMana * 10 / maxMana >= i + 1) {
                            list2.append("+");
                        } else list2.append("_");
                    }
                    System.out.println(ANSI_BLUE + "[" + list2 + "]");
                }

            }



        }
    }

        public interface haveHealth {
            public int getMaxHealth();

            public int getCurrentHealth();
        }

        public interface haveMana {
            public int getMaxMana();

            public int getCurrentMana();
        }

        static class Building implements haveHealth {

            private int maxHealthPoint; // максимально количество здоровья
            private int currentHealthPoint; // текущее количество здоровья

            public Building(int maxHealthPoint) {
                this.maxHealthPoint = maxHealthPoint;
                this.currentHealthPoint = maxHealthPoint;
            }


            public void setCurrentHealthPoint(int currentHealthPoint) {
                this.currentHealthPoint = currentHealthPoint;
            }

            @Override
            public int getMaxHealth() {
                return maxHealthPoint;
            }

            @Override
            public int getCurrentHealth() {
                return currentHealthPoint;
            }


            // FIXME: 29.06.2023 Дописать нужное
        }

        static class Hero implements haveHealth, haveMana {

            private int maxHealthPoint; // максимально количество здоровья
            private int currentHealthPoint; // текущее количество здоровья

            private int maxManaPoint; // максимально количество магический энергии
            private int currentManaPoint; // текущее количество магический энергии

            public Hero(int maxHealthPoint, int maxManaPoint) {
                this.maxHealthPoint = maxHealthPoint;
                this.maxManaPoint = maxManaPoint;

                this.currentHealthPoint = maxHealthPoint;
                this.currentManaPoint = maxManaPoint;
            }

            public void setCurrentHealthPoint(int currentHealthPoint) {
                this.currentHealthPoint = currentHealthPoint;
            }

            public void setCurrentManaPoint(int currentManaPoint) {
                this.currentManaPoint = currentManaPoint;
            }

            @Override
            public int getMaxHealth() {
                return maxHealthPoint;
            }

            @Override
            public int getCurrentHealth() {
                return currentHealthPoint;
            }

            @Override
            public int getMaxMana() {
                return maxManaPoint;
            }

            @Override
            public int getCurrentMana() {
                return currentManaPoint;
            }

            // FIXME: 29.06.2023 Дописать нужное
        }

        static class Neutral implements haveHealth {

            private int maxHealthPoint; // максимально количество здоровья
            private int currentHealthPoint; // текущее количество здоровья

            public Neutral(int maxHealthPoint) {
                this.maxHealthPoint = maxHealthPoint;
                this.currentHealthPoint = maxHealthPoint;
            }

            public void setCurrentHealthPoint(int currentHealthPoint) {
                this.currentHealthPoint = currentHealthPoint;
            }

            @Override
            public int getMaxHealth() {
                return maxHealthPoint;
            }

            @Override
            public int getCurrentHealth() {
                return currentHealthPoint;
            }

            // FIXME: 29.06.2023 Дописать нужное
        }

    }


