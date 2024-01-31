public class Main {
  public static void main(String[] args){
    // Hero インスタンスを生成
    Hero h = new Hero();
    h.name = "ミナト";
    h.hp = 100;
    System.out.println("勇者"+h.name+"を、生み出しました");
    
    // コード8-16 Matango インスタンスを生成
    Matango m1 = new Matango();
    m1.suffix = 'A';
    m1.hp = 50;
    Matango m2 = new Matango();
    m2.suffix = 'B';
    m2.hp =50;
    h.sit(5);
    h.slip();
    h.sit(25);
    h.run();
    m1.run();
    m2.run();
  }
}