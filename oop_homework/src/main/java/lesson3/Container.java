package lesson3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Container implements  Comparable<Container>,Iterable<Box>{
     
     private List<Box> list = new ArrayList<>();
      
     public void setList(Object obj){
         if(obj instanceof Box){
             list.add((Box)obj);
         } 
     }

     public void fullContainer(int count){
         for(int i =0; i<count;i++){
             int weigthBox  = ThreadLocalRandom.current().nextInt(1,5);
             Box box = new Box(weigthBox);
             this.setList(box);
         }
     }

     public int getCountBox(){
         return list.size();
     }

    @Override
    public String toString() {
        return "[Размер-"+list.size()+" Вес-" + this.getWeigth() + "]";
    }

    public int getWeigth(){
         int sum = 0;
         for (Box box:
              list) {
             sum+= box.getWeight();
         }
         return sum;
     }


     int weigth = this.getWeigth();






    @Override
    public int compareTo(Container o) {
        return this.getWeigth() - (o.getWeigth());
    }

    @Override
    public Iterator<Box> iterator() {
        return list.iterator();
    }
}
