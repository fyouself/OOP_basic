package lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class hw {
    /**
     * Создать класс Контейнер - Container.
     * В контейнере могут быть ящики (класс Box).
     *
     * У каждого ящика есть вес.
     * У каждого контейнера есть метод "получить вес" - это сумма всех весов ящиков, которые находятся в контейнере.
     *
     * 1. Класс Контейнер должен быть Comparable. Сравнивать он должен по весам контейнера (чем меньше вес, тем меньше контейнер).
     * 2. Класс ContainerCountComparator - Comparator, который сравнивает контейнеры по количеству ящиков (чем меньше ящиков, тем меньше контейнер).
     * 3. Класс контейнер должен быть Iterable - итерирование должно происходить по ящикам внутри контейнера.
     * <code>
     *     Container c = new Container(...);
     *     // ...
     *     for (Box box: c) {
     *         box - это контейнер
     *     }
     * </code>
     */

    public static void main(String[] args) {
        Container container1 = new Container();
        Container container2 = new Container();
        Container container3 = new Container();
        container1.fullContainer(3);
        container2.fullContainer(1);
        container3.fullContainer(1);

        List<Container> list = new ArrayList<>();
        list.add(container1);
        list.add(container2);
        list.add(container3);

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

        Collections.sort(list,new ContainerCountComparator());

        System.out.println(list);

        for (Box next:container1
             ) {
            System.out.println(next);
        }




//        System.out.println(container1);
//        System.out.println(container2);
//
//        System.out.println(container1.compareTo(container2));



//
    }
}
