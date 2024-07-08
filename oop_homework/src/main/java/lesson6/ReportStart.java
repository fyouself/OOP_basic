package lesson6;

public class ReportStart <T extends ConvertByteToFile,I extends InterReport> {

    public void startToPDF(Document document, Report report, T convertByteToFile ){
        report.CreateReport(document);
        convertByteToFile.ConvertByteToFile(report);
        System.out.println("Отчет отправлен");

    }



}
