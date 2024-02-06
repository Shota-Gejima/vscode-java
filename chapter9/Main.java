public class Main {
  public static void main(String[] args){
    // アドレスを作成
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
    //s の中に入っているアドレスをh3.sword中に代入
    h3.sword = s;
    System.out.println("現在の武器は"+h3.sword.name+"です");
    Wizard w = new Wizard();
    System.out.println("h3のhpは、"+h3.hp);
    int h3Hp = w.heal(h3);
    System.out.println("回復後のh3のhpは、"+h3Hp);
    Hero h4 = new Hero("アサカ");
    System.out.println(h4.hp);
    System.out.println(h4.name);
    Hero h5 = new Hero();
    System.out.println(h5.name);
  }
}
