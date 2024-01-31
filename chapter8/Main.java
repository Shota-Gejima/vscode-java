package chapter8;

public class Main {
  public static void main(String[] args){
    Hero h = new Hero();
    h.name = "ミナト";
    h.hp = 100;
    System.out.println("勇者"+h.name+"を、生み出しました");
    h.sit(5);
    h.slip();
    h.sit(25);
    h.run();
  }


}
