package lesson6;

public class ConvertToPDF implements ConvertByteToFile{
    @Override
    public void ConvertByteToFile(Report report) {
        System.out.println("Файл конвертирован в пдф");
    }
}
