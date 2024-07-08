package lesson6;

public interface InterReport <T extends Document> {
    byte CreateReport(T doc);
}
