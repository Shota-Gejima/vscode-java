public class Main{
  public static void main(String[] args){
    Sword s;
    s = new Sword();
    s.name = "炎の剣";
    s.damage = 10;

    Hero h1;
    h1 = new Hero("ミナト");
    // h1.name = "ミナト";
    // h1.hp = 100;
    h1.sword = s;

    System.out.println("現在の武器は"+ h1.sword.name + "。　攻撃力は" + h1.sword.damage);
    h1.attack();

    Hero h2 = new Hero("アサカ");
    // h2.name = "アサカ";
    // h2.hp = 100;
        
    Wizard w = new Wizard();
    w.name = "スガワラ";
    w.hp = 50;

    // w.heal(h1);
    // w.heal(h2);
    // w.heal(h2);

    Hero h3 = new Hero();

    System.out.println(h1.name + "のhpは" + h1.hp + "　で、　" + h2.name + "のhpは" + h2.hp);
    System.out.println(h3.name + h3.hp);
  }
}