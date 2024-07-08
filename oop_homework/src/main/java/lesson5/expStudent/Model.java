package lesson5.expStudent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Model {

    public void creatStudent(Group group){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set student name: ");
        Student student = new Student(scanner.nextLine(),group);
        group.getList().add(student);

    }

    public void createGroup(){
        Group group = new Group();
        gr.add(group);
    }
    private List< Group > gr = new ArrayList<>();

    public List<Group> getGr() {
        return gr;
    }

    public List<Group> getGroup(){
        return gr;
    }


}
