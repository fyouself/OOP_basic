package lesson5.expStudent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Presenter {

 public static void main(String[] args) {

 }

 String string = "     1 - создание группы\n" +
         "     2 - просмотр всех групп\n" +
         "     3 - создание студента в группе\n" +
         "     4 - просмотр всех студентов одной группы\n" +
         "     5 - выход\n";

 Voiw voiw = new Voiw();
 Model mod = new Model();


 public void start() {
  boolean cheak = true;

  while (cheak) {
   System.out.println(string);
   Scanner in = new Scanner(System.in);

   int num = in.nextInt();
   switch (num) {
    case 1:
     mod.createGroup();
     break;
    case 2:
     System.out.println(mod.getGroup());
     break;
    default:
     continue;
   }
//   if (num == 1 ){ //    - создание группы
//    mod.createGroup();
//   } else if (num ==2) { //просмотр всех групп
//    System.out.println(mod.getGroup());
//   } else if (num == 3) { //создание студента в группе
//    System.out.print(" Напишите в какую группу добавить студента: ");
//       mod.creatStudent(mod.getGr().get(in.nextInt()-1));
//   } else if (num == 4 ) { // просмотр всех студентов одной группы
//    System.out.print("Введите номер группы: ");
//    List<Student> list = mod.getGr().get(in.nextInt()-1).getList();
//    System.out.println(list);}
//   else if (num == 5) {  cheak = false;}
//  }


  }
 }
}







