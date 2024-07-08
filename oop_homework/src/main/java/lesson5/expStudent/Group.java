package lesson5.expStudent;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Group {
    private UUID id;
    private static int count=1;
    private int number;

    private List<Student> list;

    public int getNumber() {
        return number;
    }

    public int getCount() {
        return count;
    }

    public List<Student> getList() {
        return list;
    }


    public  Group(){
        this.id = UUID.randomUUID();
        this.number = count;
        list = new ArrayList<>();
        count++;
    }


    @Override
    public String toString() {
        return "Группа № " + number + "__id=" + id;
    }
}
