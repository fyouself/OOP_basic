package lesson5.expCalcul;

import java.util.Scanner;

public class Voiw {

    Scanner in = new Scanner(System.in);

    public int getValue(String string){
        System.out.printf("%s", string);
        return in.nextInt();
    }

    public void print(int dats, String title){

        System.out.printf("%s %d\n",title,dats);

    }



}
