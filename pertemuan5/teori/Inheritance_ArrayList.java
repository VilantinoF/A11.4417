import java.util.ArrayList;

public class Inheritance_ArrayList {
      public static void main(String args[]){
           Coffe kopi1 = new Coffe();
           System.out.println(kopi1.jmlCoffe());

           kopi1.addCoffe("Americano");
           kopi1.addCoffe("Cappucino");
           kopi1.addCoffe("Caramel Machiato");
           System.out.println(kopi1.jmlCoffe());

           kopi1.editCoffe(1,"Kopi Susu");
           System.out.println(kopi1.jmlCoffe());

           kopi1.delCoffe(0);
           System.out.println(kopi1.jmlCoffe());
      }
}

class Coffe_Shop {
      ArrayList<String> newCoffe = new ArrayList<>();

      public Coffe_Shop(){

      }
      public void setCoffe(ArrayList<String> newCoffe) {
            this.newCoffe = newCoffe;
      }
      public ArrayList<String> getCoffe(){
            return this.newCoffe;
      }
} 

class Coffe extends Coffe_Shop {
      public void addCoffe(String newCoffe){
            super.getCoffe().add(newCoffe);
      }
      public String delCoffe(int index){
            return super.getCoffe().remove(index);
      }
      public void editCoffe(int index, String newCoffe){
            super.getCoffe().set(index, newCoffe);
      }
      public ArrayList<String> jmlCoffe(){
            return super.getCoffe();
      }
}