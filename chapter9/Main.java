public class Main {
  public static void main(String[] args){
    Sword s = new Sword();
    s.name = "炎の剣";
    s.damage = 10;
    Hero h1;
    h1 = new Hero();
    h1.hp = 100;
    h1.name = "アサカ";
    h1.sword = s;
    Hero h2;
    h2 = h1;
    h2.hp = 200;
    System.out.println(h1.hp);
    h1.attack();
    // コード9-4
    Hero h3 = new Hero();
    h3.name = "ミナト";
    h3.hp = 100;
    h3.sword = s;
    System.out.println("現在の武器は"+h3.sword.name+"です");
  }
}
