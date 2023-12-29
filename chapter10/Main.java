public class Main{
  public static void main(String[] args){
    Matango m = new Matango();
    m.hp = 10;
    System.out.println(m.hp);

    Hero h = new Hero("ミナト");
    h.hp = 100;

    h.attack(m);
    System.out.println(m.hp);

    SuperHero sh = new SuperHero();
    sh.run();
    h.run();
    sh.fly();
    sh.attack(m);
    sh.land();
    sh.attack(m);
  }
}