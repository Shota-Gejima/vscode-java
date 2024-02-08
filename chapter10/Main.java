public class Main {
  public static void main(String[] args){
    Hero h = new Hero();
    h.run();
    SuperHero sh = new SuperHero();
    sh.run();
    sh.fly();
    Matango m = new Matango();
    sh.attack(m);
    sh.land();
    sh.attack(m);
  }
}
