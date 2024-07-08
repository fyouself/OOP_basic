package lesson5.expStudent;

public class Main {
    /**
     * Разработать свое MVP приложение со следующей моделью данных:
     * 1. Группа студентов (идентификатор, номер)
     * 2. Студент (идентификатор, имя, группа)
     * Реализовать стандартные операции:
     * - создание группы
     * - просмотр всех групп
     * - со1здание студента в группе
     * - просмотр всех студентов одной группы
     *
     * 3*. Реализовать новую сущность Урок (идентификатор, группа, дата).
     * - создание урока для групп
     * - просмотр всех уроков у студента
     *
     * lesson <-> studentGroup <- student
     */

    public static void main(String[] args) {

        Presenter p = new Presenter();
        p.start();



    }
}
