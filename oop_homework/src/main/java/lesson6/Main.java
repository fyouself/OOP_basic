package lesson6;
/**
 * Класс документ - описывает документ.
 *
 * Нужно спроектировать подсистему отчетов, которая будет формировать отчеты для документа.
 * document -> report
 * 1. Формирование PDF-файла (потенциально может быть несколько видов разметки этого PDF-файла).
 * 2. Создание JSON-файла с полями документа
 * 3. Создание XML-файла с полями документа
 * 4. ... потенциально отчеты могут добавляться.
 *
 * После реализации задать себе 2 вопроса:
 * 1. Насколько сложно добавить поддержку нового типа отчета?
 * 2. Как будет выглядеть проект, если типов отчетов будет 1000+?
 */
public class Main {

    public static void main(String[] args) {
        ReportStart reportStart = new ReportStart<>();

        reportStart.startToPDF(new Document(),new Report(), new ConvertToJSON());
        System.out.println("____");
        reportStart.startToPDF(new Document(),new Report(),new ConvertToPDF());

    }

}
