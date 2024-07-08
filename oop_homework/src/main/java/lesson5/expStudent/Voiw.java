package lesson5.expStudent;

import java.util.Scanner;

public class Voiw {

    Scanner in = new Scanner(System.in);

    public String getValue(String title){

        System.out.printf("%s",title);
       return in.nextLine();
    }

    public void print(Object obj){
        System.out.println(obj);
    }



}
