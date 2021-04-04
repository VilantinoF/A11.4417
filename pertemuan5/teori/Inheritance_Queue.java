import java.util.Queue;
import java.util.LinkedList;
public class Inheritance_Queue {
      public static void main(String args[]){
            Coffe kopi1 = new Coffe();
            System.out.println(kopi1.jmlCoffe());

            kopi1.addCoffe("Americano");
            kopi1.addCoffe("Cappucino");
            kopi1.addCoffe("Kopi Susu");
            kopi1.addCoffe("Caramel Machiato");
            kopi1.addCoffe("Mochacino");
            System.out.println(kopi1.jmlCoffe());

            kopi1.delCoffe(0);
            kopi1.delCoffe(0);
            System.out.println(kopi1.jmlCoffe());
      }      
}

class Coffe_Shop {
      Queue<String> newCoffe = new LinkedList<String>();
 
      public Coffe_Shop(){
 
      }
      public void setCoffe(Queue<String> newCoffe) {
            this.newCoffe = newCoffe;
      }
      public Queue<String> getCoffe(){
            return this.newCoffe;
      }
}

class Coffe extends Coffe_Shop {
      public void addCoffe(String newCoffe){
            super.getCoffe().add(newCoffe);
      }
      public String delCoffe(int index){
            return super.getCoffe().poll();
      }
      public Queue<String> jmlCoffe(){
            return super.getCoffe();
      }
} 