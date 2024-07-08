package lesson5.expStudent;

public class Student extends Group{
    Voiw voiw;
    private String name;
    private int number;

//    public Student(Group group, String nextLine) {
//        super();
//    }


    public  Student (String name, Group group){
        this.name = name;
        number = group.getNumber();
    }


    @Override
    public String toString() {
        return " Name = "+name;
    }
}
