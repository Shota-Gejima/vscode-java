public class Main{
  public static void main(String[] args){
    String name;
    int hp;

    Hero h = new Hero();
    h.run();

    Matango m = new Matango();

    SuperHero sh;
    sh = new SuperHero();
    sh.run();
    sh.attack(m);
  }
}