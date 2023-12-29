public class Main{
  public static void main(String[] args){
    Sword s = new Sword();
    s.name = "炎の剣";
    s.damage = 10;

    Hero h1 = new Hero("ミナト");
    // h1.name = "ゲジ";
    // h1.hp = 100;
    h1.sword = s;

    Hero h2 = new Hero("アサカ");
    // h2.name = "アサカ";
    // h2.hp = 100;

    Hero h3 = new Hero();

    Wizard w = new Wizard();
    w.name = "スガワラ";
    w.hp = 50;

    System.out.println("現在の武器は" + h1.sword.name);
    h1.attack();

    w.heal(h1);
    w.heal(h2);
    w.heal(h2);

      System.out.println(h1.name + h2.name + h3.name);
      System.out.println(h1.hp + h2.hp);
  }
}