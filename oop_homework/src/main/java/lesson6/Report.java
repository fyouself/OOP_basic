package lesson6;

public class Report  implements InterReport  {


    @Override
    public byte CreateReport(Document Doc) {
        System.out.println("Создан отчет №1 в байтах на основе документа");
        return 0;
    }
}
